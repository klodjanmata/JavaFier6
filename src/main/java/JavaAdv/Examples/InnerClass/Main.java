package JavaAdv.Examples.InnerClass;

public class Main {
    public static void main(String[] args) {
        Outer object = new Outer();
        System.out.println(Outer.x);
        Outer.NestedStatic ns = new Outer.NestedStatic();
        System.out.println(object.y);
        Outer.Inner i = object.new Inner();
    }
}
