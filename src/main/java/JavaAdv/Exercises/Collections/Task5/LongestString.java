package JavaAdv.Exercises.Collections.Task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {

    }

    public static List<String> readFromFile(){
        List<String> words = new ArrayList<>();
        String filepath = "Files/University/Students.csv";
        String separator = ",";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while((line = br.readLine()) != null){
                String[] values = line.split(separator);
                for (String s : values){
                    words.add(s);
                }
            }
            br.close();
            System.out.println("Words read: " + words.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return words;
    }
}
