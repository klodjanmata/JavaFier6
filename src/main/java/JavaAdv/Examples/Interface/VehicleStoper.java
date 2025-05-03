package JavaAdv.Examples.Interface;

public interface VehicleStoper {

    default void stopVehicle() {
        System.out.println( "Vehicle is stopping");
    }
}
