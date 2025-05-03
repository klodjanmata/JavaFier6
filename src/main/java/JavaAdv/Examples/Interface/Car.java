package JavaAdv.Examples.Interface;

public class Car implements EngineStarter, VehicleStoper{

    @Override
    public void startEngine() {
        System.out.println("Car is starting");
    }


}
