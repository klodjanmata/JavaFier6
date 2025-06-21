package JavaAdv.Exercises.Collections.Task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();
        StudentCsvUtil studentCsvUtil = new StudentCsvUtil();
        studentMap = studentCsvUtil.readStudentsFromFile();

        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.print(entry.getKey() + "\t");
            System.out.print(entry.getValue().getFirstName() + " ");
            System.out.println(entry.getValue().getLastName());
        }

    }
}
