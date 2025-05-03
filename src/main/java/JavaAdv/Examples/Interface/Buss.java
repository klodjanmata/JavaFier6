package JavaAdv.Examples.Interface;

public class Buss implements EngineStarter, VehicleStoper{
    @Override
    public void startEngine() {
        System.out.println("Buss is starting");
    }
}
