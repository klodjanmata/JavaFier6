package JavaAdv.Exercises.Collections.Task4;

public class Student {
    private String ID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Phone;
    private int yearOfStart;
    private float GPA;

    public Student() {}

    public Student(String ID, String firstName, String lastName,
                   String email, String phone, int yearOfStart, float GPA) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Phone = phone;
        this.yearOfStart = yearOfStart;
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    public void setYearOfStart(int yearOfStart) {
        this.yearOfStart = yearOfStart;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", yearOfStart=" + yearOfStart +
                ", GPA=" + GPA +
                '}';
    }
}
