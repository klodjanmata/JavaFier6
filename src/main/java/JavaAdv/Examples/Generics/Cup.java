package JavaAdv.Examples.Generics;

public class Cup<T extends Liquid>{

    private final T liquid;

    public Cup(T liquid){
        this.liquid = liquid;
    }

    public <T extends Liquid> Cup<T> fillTheCup(T liquid){
        return new Cup<>(liquid);
    }

    public T getLiquid(){
        return liquid;
    }

    public void drink(){
        System.out.println("Drinking " + liquid);
    }
}
