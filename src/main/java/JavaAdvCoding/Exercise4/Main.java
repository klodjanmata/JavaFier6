package JavaAdvCoding.Exercise4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("Albania", "Tirana");
        storage.addToStorage("Germany", "Berlin");
        storage.addToStorage("Spain", "Madrid");
        storage.addToStorage("Italy", "Roma");
        storage.addToStorage("Great Britain", "London");
        storage.addToStorage("Hungary", "Budapest");

        System.out.println(storage.findByKey("Albania"));

        Storage.printAll(storage.findByValue("London"));

        System.out.println("All elements: ");
        storage.printAll();
    }
}
