package JavaAdv.Exercises.Generics.Task5;

public class Main {
    public static void main(String[] args) {
        PetHouse<Pet> danjasPetHouse = new PetHouse<>(
                "Parajsa e kafsheve",
                "Fier",
                "9:00 -- 5:00"
        );

        System.out.println(danjasPetHouse);

        Dog d1 = new Dog("Husky", "Grey", "Hachiko");
        Dog d2 = new Dog("German Shepherd", "Grey", "Blondi");
        Cat c1 = new Cat("Scottish Fold", "Grey", "Scotty");
        Cat c2 = new Cat("Munchkin", "Black", "Butch");

        danjasPetHouse.addPet(d1);
        danjasPetHouse.addPet(d2);
        danjasPetHouse.addPet(c1);
        danjasPetHouse.addPet(c2);

        System.out.println("-------------------");
        danjasPetHouse.printPetDetails();
        System.out.println("-------------------");
        System.out.println(danjasPetHouse);

        danjasPetHouse.removePet(d2);


        System.out.println("-------------------");
        danjasPetHouse.printPetDetails();
        System.out.println("-------------------");
        System.out.println(danjasPetHouse);



    }
}
