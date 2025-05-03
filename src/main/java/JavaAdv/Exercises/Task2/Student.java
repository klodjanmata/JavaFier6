package JavaAdv.Exercises.Task2;

public class Student extends Person {
    private String fieldOfStudy;
    private int yearOfStart;
    private float studyPrice;

    public Student(String fieldOfStudy, int yearOfStart, float studyPrice){
        super();
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfStart = yearOfStart;
        this.studyPrice = studyPrice;
    }

    public Student(String name, String address, String fieldOfStudy, int yearOfStart, float studyPrice){
        super(name, address);
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfStart = yearOfStart;
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", Field of Study: %s, Year of Start: %d, Study Price: %.2f", fieldOfStudy, yearOfStart, studyPrice);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    public void setYearOfStart(int yearOfStart) {
        this.yearOfStart = yearOfStart;
    }

    public float getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(float studyPrice) {
        this.studyPrice = studyPrice;
    }
}
