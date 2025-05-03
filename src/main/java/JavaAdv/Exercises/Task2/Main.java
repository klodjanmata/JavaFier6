package JavaAdv.Exercises.Task2;

public class Main {
    public static void main(String[] args) {
        Person p = new Student("Malvin", "Fier", "Java Programming", 2025, 1000);
        System.out.println(p);

        p = new Lecturer("Olta", "Fier", "Informatike", 2000);
        System.out.println(p);
    }
}
