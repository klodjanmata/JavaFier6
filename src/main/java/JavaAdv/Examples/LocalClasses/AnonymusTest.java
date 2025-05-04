package JavaAdv.Examples.LocalClasses;

public class AnonymusTest {

    public static void main(String[] args){
        MyAnonnymousClass myAnonnymousClass = new MyAnonnymousClass(){
            @Override
            public void print() {
                System.out.println("Hello Anonymus class");
            }
        };

        myAnonnymousClass.print();


        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void print() {
                System.out.println("Hello Anonymus Interface");
            }
        };

        anonymousInterface.print();
    }

}
