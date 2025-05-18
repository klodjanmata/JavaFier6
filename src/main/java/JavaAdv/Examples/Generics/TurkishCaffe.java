package JavaAdv.Examples.Generics;

public class TurkishCaffe extends Caffe{

    public TurkishCaffe(String name){
        super(name);
    }

    @Override
    public String toString(){
        return super.toString() + " Turkish Caffe";
    }
}
