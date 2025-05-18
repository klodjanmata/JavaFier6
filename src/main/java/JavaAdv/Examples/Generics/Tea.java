package JavaAdv.Examples.Generics;

public class Tea extends Liquid{
    private final String name;

    public Tea(String name){
        this.name = name;
    }

    public String toString(){
        return name + " tea";
    }
}
