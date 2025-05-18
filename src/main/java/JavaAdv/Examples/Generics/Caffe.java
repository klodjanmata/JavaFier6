package JavaAdv.Examples.Generics;

public class Caffe extends Liquid{
    private final String name;

    public Caffe(String name){
        this.name = name;
    }

    public String toString(){
        return name + " caffe";
    }
}
