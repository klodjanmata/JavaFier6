package JavaAdv.Examples.Generics.Liquid;

public class Caffe extends Liquid{
    private final String name;

    public Caffe(String name){
        this.name = name;
    }

    public String toString(){
        return name + " caffe";
    }
}
