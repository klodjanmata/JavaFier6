package JavaAdv.Exercises.OOP.Task2;

public class Lecturer extends Person{
    private String specialization;
    private float salary;

    public Lecturer(String specialization, float salary){
        super();
        this.specialization = specialization;
        this.salary = salary;
    }

    public Lecturer(String name, String address, String specialization, float salary){
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", Specialization: %s, Salary: %.2f", specialization, salary);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
