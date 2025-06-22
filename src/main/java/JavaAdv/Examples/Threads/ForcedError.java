package JavaAdv.Examples.Threads;

public class ForcedError implements Runnable{

    private int number;
    private String name;

    public ForcedError(int number, String name){
        this.number = number;
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            number = number + 1;
            System.out.println(name + " --- " + number);
        }
    }

    public static void main(String[] args) {
        int number = 0;

        Runnable r1 = new ForcedError(number, "One");
        Thread one = new Thread(r1);
        one.start();
        try {
            one.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Runnable r2 = new ForcedError(number, "Two");
        Thread two = new Thread(r2);
        try {
            two.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        two.start();

        Runnable r3 = new ForcedError(number, "Three");
        Thread three = new Thread(r3);
        three.start();
    }
}
