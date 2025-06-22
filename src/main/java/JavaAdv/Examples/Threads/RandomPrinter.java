package JavaAdv.Examples.Threads;

import java.util.Random;

public class RandomPrinter implements Runnable {
    private String printerName;

    public RandomPrinter(String printerName){
        this.printerName = printerName;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int number = random.nextInt(100) + 1;
            System.out.print(printerName +  " --- ");
            System.out.println("Random number: " + number);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Runnable task1 = new RandomPrinter("Malvin");
        Thread t1 = new Thread(task1);
        t1.start();
        Runnable task2 = new RandomPrinter("Armela");
        Thread t2 = new Thread(task2);
        t2.start();
    }
}
