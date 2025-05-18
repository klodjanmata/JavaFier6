package JavaAdv.Examples.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
//        String s = "Hello From Fieri!";
//        writeToFile(s);

        String textFromFile = readFromFile("Files/input.txt");
        System.out.println(textFromFile);
    }

    public static void writeToFile(String s) {
        try (FileWriter writer = new FileWriter("Files/test.txt")) {
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int c;
            String s = "";
            while ((c = reader.read()) != -1) {
                s += (char) c;
            }
            reader.close();
            return s;
        } catch (IOException e) {
            System.out.println("File NOT FOUND");
            return null;
        }
    }
}
