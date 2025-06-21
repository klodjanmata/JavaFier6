package JavaAdv.Exercises.Collections.Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class StudentCsvUtil {
    private final String FILEPATH = "Files/University/Students.csv";
    private final String SEPARATOR = ",";

    public HashMap<String, Student> readStudentsFromFile(){
        HashMap<String, Student> studentsMap = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILEPATH))){
            boolean isFirstLine = true;
            String line;
            while ((line = br.readLine()) != null){
                if (isFirstLine){
                    isFirstLine = false;
                    continue;
                }
                String[] fields = line.split(SEPARATOR);
                Student s = new Student();
                s.setID(fields[0]);
                s.setFirstName(fields[1]);
                s.setLastName(fields[2]);
                s.setEmail(fields[3]);
                s.setPhone(fields[4]);
                s.setYearOfStart(Integer.parseInt(fields[5]));
                s.setGPA(Float.parseFloat(fields[6]));
                studentsMap.put(s.getID(), s);
            }
            br.close();
            System.out.println("Successfully read students from file");
        }catch (Exception e){
            e.printStackTrace();
        }

        return studentsMap;
    }
}
