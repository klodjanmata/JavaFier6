package JavaAdv.Examples.AbstractClasses;

public abstract class Animal {
    private String name;

    public void eat(){
        System.out.println("Animal is eating!");
    }

    public abstract void makeNoise();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
