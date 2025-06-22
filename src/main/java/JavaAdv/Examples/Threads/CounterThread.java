package JavaAdv.Examples.Threads;

public class CounterThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++){
            System.out.println("Counter Thread " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args){
        CounterThread ct = new CounterThread();
        ct.start();
    }
}
