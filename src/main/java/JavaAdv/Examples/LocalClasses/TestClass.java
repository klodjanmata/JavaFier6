package JavaAdv.Examples.LocalClasses;

public class TestClass {


    public void print(){

        class Local{
            public int number;

            public Local(int number){
                this.number = number;
            }

            public void print(){
                System.out.print(" " + number);
            }
        }

        Local local = new Local(10);
        local.print();

        Local local2 = new Local(25);
        System.out.print("I am ");
        local2.print();
        System.out.println(" years old");
    }

}
