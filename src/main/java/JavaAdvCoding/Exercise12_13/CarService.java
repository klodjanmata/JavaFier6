package JavaAdvCoding.Exercise12_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> carsList;

    public CarService() {
        this.carsList = initList();
    }

    public void addToList(Car car){
        carsList.add(car);
    }

    public void removeFromList(Car car){
        if (carsList.contains(car)){
            carsList.remove(car);
        }
    }

    public List<Car> getCarsList(){
        return carsList;
    }

    public List<Car> getByEngineType(EngineType engineType){
        return carsList.stream()
                .filter(c -> c.getEngineType() == engineType)
                .collect(Collectors.toList());
    }

    public List<Car> getProducedBeforeYear(int year){
        return carsList.stream()
                .filter(c -> c.getYear() < year)
                .collect(Collectors.toList());
    }

    public List<Car> getProducedAfterYear(int year){
        return carsList.stream()
                .filter(c -> c.getYear() > year)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar(){
        return carsList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList()).get(0);
    }

    public Car getCheapestCar(){
        return carsList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .collect(Collectors.toList()).get(0);
    }

    public List<Car> getByManufacturer(String manufacturerName){
        return carsList.stream()
                .filter(car ->
                        car.getManufacturer().getName().equals(manufacturerName))
                .collect(Collectors.toList());
    }

    public List<Car> orderedList(boolean ascending){
        if (ascending){
            return carsList.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        }
        else{
            return carsList.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
    }

    public boolean contains(Car car){
        return carsList.contains(car);
    }

    public List<Car> deepSearch(String inputString){
        List<Car> listToReturn = new ArrayList<>();
        for (Car c : carsList) {
            if (c.getName().equals(inputString)) {
                listToReturn.add(c);
                continue;
            }
            if (c.getModel().equals(inputString)) {
                listToReturn.add(c);
                continue;
            }
            if (String.valueOf(c.getYear()).equals(inputString)) {
                listToReturn.add(c);
                continue;
            }
            if (String.valueOf(c.getPrice()).contains(inputString)){
                listToReturn.add(c);
                continue;
            }
            if (String.valueOf(c.getEngineType()).equals(inputString)) {
                listToReturn.add(c);
                continue;
            }
            if (c.getManufacturer().getName().equals(inputString)) {
                listToReturn.add(c);
                continue;
            }
            if (c.getManufacturer().getCountry().equals(inputString)) {
                listToReturn.add(c);
                continue;
            }
        }
        return listToReturn;
    }

    public List<Car> manufacturerYear(int year, String comparator){
        if(comparator.equals("<")){
            return carsList.stream()
                    .filter(car ->
                        car.getManufacturer().getYearOfEstablishment() < year)
                    .collect(Collectors.toList());
        }
        else if (comparator.equals(">")){
            return carsList.stream()
                    .filter(car ->
                        car.getManufacturer().getYearOfEstablishment() > year)
                    .collect(Collectors.toList());
        }
        else if (comparator.equals("=")){
            return carsList.stream()
                    .filter(car ->
                            car.getManufacturer().getYearOfEstablishment() == year)
                    .collect(Collectors.toList());
        }
        else if (comparator.equals("<=")){
            return carsList.stream()
                    .filter(car ->
                            car.getManufacturer().getYearOfEstablishment() <= year)
                    .collect(Collectors.toList());
        }
        else if (comparator.equals(">=")){
            return carsList.stream()
                    .filter(car ->
                            car.getManufacturer().getYearOfEstablishment() >= year)
                    .collect(Collectors.toList());
        }
        else if (comparator.equals("!=")){
            return carsList.stream()
                    .filter(car ->
                            car.getManufacturer().getYearOfEstablishment() != year)
                    .collect(Collectors.toList());
        }
        System.out.println("Invalid comparator");
        return null;
    }

    public void printCarList(List<Car> carList){
        for (Car c : carList) {
            System.out.println(c);
        }
    }

    public List<Car> initList(){
        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("Ford", "Mustang", 115890, 2005, new Manufacturer("Ford", 1903, "USA"), EngineType.V12),
                new Car("Mercedes-Benz", "GLE", 114590, 2015, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.V8),
                new Car("Ferrari", "488", 125547, 2013, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.F6),
                new Car("Volkswagen", "Passat", 153776, 2021, new Manufacturer("Volkswagen", 1937, "Germany"), EngineType.ELECTRIC),
                new Car("Mercedes-Benz", "GLE", 42717, 2015, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.F4),
                new Car("BMW", "X5", 81585, 2011, new Manufacturer("BMW", 1916, "Germany"), EngineType.ELECTRIC),
                new Car("Hyundai", "Tucson", 50616, 2019, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.S6),
                new Car("BMW", "X5", 162198, 2014, new Manufacturer("BMW", 1916, "Germany"), EngineType.V10),
                new Car("Lamborghini", "Urus", 186028, 2016, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.ELECTRIC),
                new Car("Ford", "Mustang", 120268, 2023, new Manufacturer("Ford", 1903, "USA"), EngineType.ELECTRIC),
                new Car("Honda", "CR-V", 70740, 2013, new Manufacturer("Honda", 1948, "Japan"), EngineType.ELECTRIC),
                new Car("Honda", "Accord", 61303, 2011, new Manufacturer("Honda", 1948, "Japan"), EngineType.S3),
                new Car("Toyota", "Prius", 72437, 2019, new Manufacturer("Toyota", 1937, "Japan"), EngineType.V12),
                new Car("BMW", "3 Series", 155266, 2019, new Manufacturer("BMW", 1916, "Germany"), EngineType.S4),
                new Car("BMW", "3 Series", 118341, 2013, new Manufacturer("BMW", 1916, "Germany"), EngineType.F6),
                new Car("Ferrari", "F8 Tributo", 132671, 2005, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.S6),
                new Car("Honda", "Fit", 113092, 2011, new Manufacturer("Honda", 1948, "Japan"), EngineType.S3),
                new Car("Mercedes-Benz", "GLE", 158882, 2013, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.ELECTRIC),
                new Car("Lamborghini", "Huracan", 185635, 2006, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.V6),
                new Car("Honda", "Accord", 71822, 2010, new Manufacturer("Honda", 1948, "Japan"), EngineType.S4),
                new Car("Volkswagen", "Golf", 93845, 2010, new Manufacturer("Volkswagen", 1937, "Germany"), EngineType.F6),
                new Car("Ferrari", "Roma", 65612, 2007, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.V12),
                new Car("Honda", "Civic", 168090, 2017, new Manufacturer("Honda", 1948, "Japan"), EngineType.S6),
                new Car("Honda", "CR-V", 184722, 2018, new Manufacturer("Honda", 1948, "Japan"), EngineType.F4),
                new Car("Ferrari", "F8 Tributo", 72766, 2020, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.V6),
                new Car("Ford", "Focus", 174730, 2014, new Manufacturer("Ford", 1903, "USA"), EngineType.S6),
                new Car("Hyundai", "Sonata", 112219, 2006, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.V8),
                new Car("Lamborghini", "Urus", 140021, 2016, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.ELECTRIC),
                new Car("Hyundai", "Elantra", 128850, 2011, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.F4),
                new Car("Hyundai", "Elantra", 187715, 2018, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.F4),
                new Car("BMW", "X5", 83925, 2009, new Manufacturer("BMW", 1916, "Germany"), EngineType.V6),
                new Car("Toyota", "Camry", 123975, 2015, new Manufacturer("Toyota", 1937, "Japan"), EngineType.F6),
                new Car("Lamborghini", "Urus", 95718, 2014, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.ELECTRIC),
                new Car("Ferrari", "F8 Tributo", 72038, 2019, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.V12),
                new Car("Ford", "Mustang", 137713, 2012, new Manufacturer("Ford", 1903, "USA"), EngineType.V12),
                new Car("Ferrari", "488", 115829, 2018, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.F4),
                new Car("Ford", "Focus", 86898, 2020, new Manufacturer("Ford", 1903, "USA"), EngineType.V12),
                new Car("Toyota", "Camry", 123076, 2022, new Manufacturer("Toyota", 1937, "Japan"), EngineType.ELECTRIC),
                new Car("Volkswagen", "Tiguan", 161180, 2021, new Manufacturer("Volkswagen", 1937, "Germany"), EngineType.S3),
                new Car("Toyota", "Camry", 195741, 2007, new Manufacturer("Toyota", 1937, "Japan"), EngineType.F6),
                new Car("BMW", "5 Series", 71941, 2011, new Manufacturer("BMW", 1916, "Germany"), EngineType.F4),
                new Car("Lamborghini", "Urus", 141544, 2009, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.F6),
                new Car("Hyundai", "Santa Fe", 186355, 2012, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.ELECTRIC),
                new Car("BMW", "M3", 116816, 2022, new Manufacturer("BMW", 1916, "Germany"), EngineType.F4),
                new Car("Hyundai", "Santa Fe", 53941, 2010, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.V12),
                new Car("Lamborghini", "Urus", 91994, 2007, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.F6),
                new Car("Ferrari", "488", 90869, 2013, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.V10),
                new Car("Mercedes-Benz", "S-Class", 185145, 2015, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.V6),
                new Car("Ford", "F-150", 28743, 2022, new Manufacturer("Ford", 1903, "USA"), EngineType.F6),
                new Car("Lamborghini", "Aventador", 49291, 2008, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.S6),
                new Car("Lamborghini", "Huracan", 180342, 2015, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.ELECTRIC),
                new Car("Hyundai", "Tucson", 116514, 2019, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.V10),
                new Car("Toyota", "Prius", 166154, 2021, new Manufacturer("Toyota", 1937, "Japan"), EngineType.S3),
                new Car("Volkswagen", "Golf", 73083, 2009, new Manufacturer("Volkswagen", 1937, "Germany"), EngineType.S3),
                new Car("Tesla", "Model 3", 143575, 2019, new Manufacturer("Tesla", 2003, "USA"), EngineType.ELECTRIC),
                new Car("Ford", "Explorer", 146317, 2011, new Manufacturer("Ford", 1903, "USA"), EngineType.V6),
                new Car("Ferrari", "488", 51304, 2023, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.V6),
                new Car("Ferrari", "488", 190351, 2022, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.S6),
                new Car("Ferrari", "488", 36899, 2012, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.V8),
                new Car("Volkswagen", "Jetta", 60424, 2005, new Manufacturer("Volkswagen", 1937, "Germany"), EngineType.S6),
                new Car("Ford", "Focus", 156786, 2010, new Manufacturer("Ford", 1903, "USA"), EngineType.F4),
                new Car("Volkswagen", "Passat", 88332, 2005, new Manufacturer("Volkswagen", 1937, "Germany"), EngineType.F4),
                new Car("Ford", "Explorer", 60426, 2007, new Manufacturer("Ford", 1903, "USA"), EngineType.V8),
                new Car("BMW", "3 Series", 68290, 2009, new Manufacturer("BMW", 1916, "Germany"), EngineType.V6),
                new Car("Honda", "Civic", 87534, 2016, new Manufacturer("Honda", 1948, "Japan"), EngineType.S3),
                new Car("BMW", "X5", 137071, 2005, new Manufacturer("BMW", 1916, "Germany"), EngineType.V12),
                new Car("Tesla", "Model X", 141065, 2007, new Manufacturer("Tesla", 2003, "USA"), EngineType.F4),
                new Car("Mercedes-Benz", "S-Class", 48757, 2006, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.ELECTRIC),
                new Car("Volkswagen", "Tiguan", 25557, 2012, new Manufacturer("Volkswagen", 1937, "Germany"), EngineType.F4),
                new Car("Ferrari", "Roma", 166697, 2014, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.ELECTRIC),
                new Car("Tesla", "Model X", 143612, 2014, new Manufacturer("Tesla", 2003, "USA"), EngineType.S6),
                new Car("Hyundai", "Elantra", 168725, 2010, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.V8),
                new Car("Honda", "Fit", 126029, 2019, new Manufacturer("Honda", 1948, "Japan"), EngineType.S3),
                new Car("Mercedes-Benz", "E-Class", 177567, 2009, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.V10),
                new Car("Honda", "Civic", 62594, 2014, new Manufacturer("Honda", 1948, "Japan"), EngineType.V6),
                new Car("Lamborghini", "Urus", 36088, 2021, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.S4),
                new Car("Lamborghini", "Urus", 88049, 2013, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.S3),
                new Car("Ferrari", "Roma", 177562, 2018, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.S6),
                new Car("Ford", "F-150", 103302, 2009, new Manufacturer("Ford", 1903, "USA"), EngineType.S6),
                new Car("Lamborghini", "Urus", 83330, 2020, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.ELECTRIC),
                new Car("Hyundai", "Santa Fe", 36341, 2016, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.V8),
                new Car("Mercedes-Benz", "S-Class", 34754, 2017, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.V10),
                new Car("Toyota", "Prius", 124923, 2024, new Manufacturer("Toyota", 1937, "Japan"), EngineType.S6),
                new Car("Tesla", "Model Y", 186883, 2013, new Manufacturer("Tesla", 2003, "USA"), EngineType.S3),
                new Car("Ferrari", "F8 Tributo", 163840, 2013, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.V10),
                new Car("Tesla", "Model S", 150776, 2007, new Manufacturer("Tesla", 2003, "USA"), EngineType.F6),
                new Car("Ferrari", "F8 Tributo", 131385, 2009, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.F6),
                new Car("Hyundai", "Santa Fe", 31033, 2018, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.V10),
                new Car("Honda", "Accord", 143259, 2021, new Manufacturer("Honda", 1948, "Japan"), EngineType.F6),
                new Car("Ford", "F-150", 129986, 2015, new Manufacturer("Ford", 1903, "USA"), EngineType.S3),
                new Car("Lamborghini", "Aventador", 59636, 2014, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.F4),
                new Car("Mercedes-Benz", "E-Class", 149737, 2007, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.S4),
                new Car("BMW", "X5", 192413, 2024, new Manufacturer("BMW", 1916, "Germany"), EngineType.F6),
                new Car("Ferrari", "488", 125982, 2020, new Manufacturer("Ferrari", 1939, "Italy"), EngineType.F6),
                new Car("Tesla", "Model X", 188193, 2013, new Manufacturer("Tesla", 2003, "USA"), EngineType.F4),
                new Car("Lamborghini", "Urus", 57707, 2019, new Manufacturer("Lamborghini", 1963, "Italy"), EngineType.V8),
                new Car("Hyundai", "Santa Fe", 181208, 2023, new Manufacturer("Hyundai", 1967, "South Korea"), EngineType.V6),
                new Car("Honda", "Accord", 83830, 2009, new Manufacturer("Honda", 1948, "Japan"), EngineType.F6),
                new Car("Mercedes-Benz", "E-Class", 53141, 2018, new Manufacturer("Mercedes-Benz", 1926, "Germany"), EngineType.V12),
                new Car("Honda", "Accord", 132642, 2016, new Manufacturer("Honda", 1948, "Japan"), EngineType.V10)
        ));
        return cars;
    }
}
