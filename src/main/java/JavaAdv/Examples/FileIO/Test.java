package JavaAdv.Examples.FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        String s = "Hello From Fieri!";
        try(FileWriter writer = new FileWriter("Files/test.txt")){
            for (int i = 0; i < s.length(); i++){
                writer.write(s.charAt(i));
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
