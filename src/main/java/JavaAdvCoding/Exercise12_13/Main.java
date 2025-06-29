package JavaAdvCoding.Exercise12_13;

import Helper.Helper;

public class Main {
    private CarService carService;

    public static void main(String[] args) {
        Main main = new Main();
        int choice;
        while(true){
            Menu.printMainMenu();
            choice = Helper.getIntFromUser("Chose one option: ");
            if (choice == 0){
                return;
            }
            main.manageChoice(choice);
        }
    }

    public void manageChoice(int choice){
        Car m4 = new Car("BMW", "M4", 80000, 2025, new Manufacturer("BMW", 1916, "Germany"), EngineType.S6);
        switch (choice) {
            case 1:
                carService.addToList(getCarUser());
                break;
            case 2:
                carService.removeFromList(m4);
            case 3:
                carService.printCarList(carService.getCarsList());
                break;
            case 4:
                carService.printCarList(carService.getByEngineType(EngineType.S6));
                break;
            case 5:
                carService.printCarList(carService.getProducedBeforeYear(2000));
                break;
            case 6:
                carService.printCarList(carService.getProducedAfterYear(2010));
                break;
            case 7:
                System.out.println("Most Expensive Car: \n" + carService.getMostExpensiveCar());
                break;
            case 8:
                System.out.println("Cheapest Car: \n" + carService.getCheapestCar());
                break;
            case 9:
                carService.printCarList(carService.getByManufacturer("BMW"));
                break;
            case 10:
                carService.printCarList(carService.orderedList(true));
                break;
            case 11:
                System.out.println("Does List contain M4: " + carService.contains(m4));
                break;
            case 12:
                System.out.println("Deep search: ");
                carService.printCarList(carService.deepSearch(Helper.getStringFromUser("Input the search text: ")));
                break;
            case 13:
                carService.printCarList(carService.manufacturerYear(2000, ">="));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public Car getCarUser(){
        Car newCar = new Car();
        System.out.println("Give the necessary details for the car: ");
        newCar.setName(Helper.getStringFromUser("Input the name: "));
        newCar.setModel(Helper.getStringFromUser("Input the model: "));
        newCar.setYear(Helper.getIntFromUser("Input the year: "));
        newCar.setPrice(Helper.getIntFromUser("Input the price: "));
        System.out.println("Supported Engine types: " + EngineType.printString());
        try{
            newCar.setEngineType(EngineType.valueOf(Helper.getStringFromUser("Input the engine: ").toUpperCase()));
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid choice, engine type set to default: OTHER");
            newCar.setEngineType(EngineType.OTHER);
        }
        Manufacturer m = new Manufacturer();
        System.out.println("Give the manufacturer details: ");
        m.setName(Helper.getStringFromUser("Input the name: "));
        m.setCountry(Helper.getStringFromUser("Input the country: "));
        m.setYearOfEstablishment(Helper.getIntFromUser("Input the year of establishment: "));
        newCar.setManufacturer(m);
        return newCar;
    }

    public Main (){
        this.carService = new CarService();
    }
}
