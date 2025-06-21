package JavaAdv.Exercises.Collections.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

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

    public void writeStudentsToFile(HashMap<String, Student> studentsMap){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH))){
            bw.write(headline());
            for (Student s : studentsMap.values()){
                bw.newLine();
                bw.write(s.getID() + SEPARATOR);
                bw.write(s.getFirstName() + SEPARATOR);
                bw.write(s.getLastName() + SEPARATOR);
                bw.write(s.getEmail() + SEPARATOR);
                bw.write(s.getPhone() + SEPARATOR);
                bw.write(s.getYearOfStart() + SEPARATOR);
                bw.write(String.valueOf(s.getGPA()));
            }
            bw.close();
            System.out.println("Successfully wrote students to the file");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String headline(){
        return "ID,FirstName,LastName,Email,Phone,YearOfStart,GPA";
    }
}
