package JavaAdv.Exercises.Generics.Task5;

import java.util.ArrayList;
import java.util.List;

public class PetHouse<T extends Pet> {
    private String name;
    private String address;
    private int numberOfPets;
    private String timetable;
    private List<T> petList;

    public PetHouse (String name , String address , String timetable){
        this.name=name;
        this.address = address;
        this.numberOfPets = 0;
        this.timetable = timetable;
        this.petList = new ArrayList<>();
    }

    public void printPetDetails(){
        for (T pet : petList){
            System.out.println(pet);
        }
    }

    public void addPet(T pet){
        petList.add(pet);
        numberOfPets++;
    }

    public void removePet(T pet){
        petList.remove(pet);
        numberOfPets--;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<T> getPets() {
        return petList;
    }

    public void setPets(List<T> pets) {
        this.petList = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    @Override
    public String toString() {
        return "PetHouse{" +
                "name='" + name + '\'' +
                ", adress='" + address + '\'' +
                ", numberOfPets='" + numberOfPets + '\'' +
                ", timetable='" + timetable + '\'' +
                '}';
    }

}
