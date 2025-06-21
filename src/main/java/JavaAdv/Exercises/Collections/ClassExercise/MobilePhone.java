package JavaAdv.Exercises.Collections.ClassExercise;

public class MobilePhone {
    private String manufacturer;
    private String model;
    private float screenSize;
    private int yearOfProduction;
    private float batteryCapacity;
    private float price;

    public MobilePhone(){}

    public MobilePhone(String manufacturer, String model, float screenSize, int yearOfProduction, float batteryCapacity, float price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", yearOfProduction=" + yearOfProduction +
                ", batteryCapacity=" + batteryCapacity +
                ", price=" + price +
                '}';
    }
}
