package JavaAdv.Exercises.OOP.Task2;

public abstract class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(){
        this("", "");
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Address: %s", this.name, this.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
