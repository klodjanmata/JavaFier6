package JavaAdv.Examples.Exception;

public class Test {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        System.out.println(array[5]);
        try {
            System.out.println(array[5]);
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Hello World");
    }
}
