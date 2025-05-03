package JavaAdv.Examples.AbstractClasses;

public class Main {

    public static void main(String[] args) {
        Animal animal;
        Cat cat = new Cat();
        cat.setName("Tom");
        executeAnimalMethods(cat);

        Dog dog = new Dog();
        dog.setName("Speed");
        executeAnimalMethods(dog);

        Duck duck = new Duck();
        duck.setName("Donald");
        executeAnimalMethods(duck);
    }

    public static void executeAnimalMethods(Animal animal){
        animal.eat();
        animal.makeNoise();
    }


//    public static void main(String[] args) {
//         Anonymus class example
//        Animal animal = new Animal() {
//            @Override
//            public void makeNoise() {
//                System.out.println("Animal noise");
//            }
//        };
//        animal.makeNoise();
//    }
}
