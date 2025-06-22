package JavaAdv.Exercises.Generics.Task5;

public class Dog extends Pet{
    private String name;
    private String breed;
    private String colour;

    public Dog(String breed, String colour, String name) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}