package JavaAdv.Examples.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();

        Buss buss = new Buss();
        buss.startEngine();

        System.out.println("Stoping test");
        car.stopVehicle();
        buss.stopVehicle();
    }
}
