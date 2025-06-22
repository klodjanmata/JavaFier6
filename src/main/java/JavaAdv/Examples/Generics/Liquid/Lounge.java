package JavaAdv.Examples.Generics.Liquid;

public class Lounge {

    public static void main(String[] args) {
        System.out.println("------ Mayfair ------");
        Tea lemonTea = new Tea("Lemon");
        Cup<Tea> teaCup = new Cup<>(lemonTea);
        teaCup.drink();

        Caffe espresso = new Caffe("Espresso");
        Cup<Caffe> caffeCup = new Cup<>(espresso);
        caffeCup.drink();

        TurkishCaffe turkishCaffe = new TurkishCaffe("Turkish");
        Cup<TurkishCaffe> turkishCaffeCup = new Cup<>(turkishCaffe);
        turkishCaffeCup.drink();


    }
}
