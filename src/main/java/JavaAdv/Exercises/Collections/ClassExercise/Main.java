package JavaAdv.Exercises.Collections.ClassExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<MobilePhone> phones = new ArrayList<>();
//        fillData(phones);
//
//        writePhonesToFile(phones);
//
//        List<MobilePhone> sortedPhones = phones.stream()
//                .sorted(Comparator.comparing(MobilePhone::getManufacturer))
//                .collect(Collectors.toList());
        // Print the list
        List<MobilePhone> mobilePhones = readFromFile();

        for (MobilePhone phone : mobilePhones) {
            System.out.println(phone);
        }
    }

    public static List<MobilePhone> readFromFile(){
        List<MobilePhone> phones = new ArrayList<>();
        final String FILEPATH = "Files/Phones.csv";
        final String SEPARATOR = ",";
        try(BufferedReader br = new BufferedReader(new FileReader(FILEPATH))){
            String line;
            boolean isFirstLine = true;
            while((line = br.readLine()) != null){
                if(isFirstLine){
                    isFirstLine = false;
                    continue;
                }
                String[] fields = line.split(SEPARATOR);
                MobilePhone phone = new MobilePhone();
                phone.setManufacturer(fields[0]);
                phone.setModel(fields[1]);
                phone.setScreenSize(Float.parseFloat(fields[2]));
                phone.setYearOfProduction(Integer.parseInt(fields[3]));
                phone.setBatteryCapacity(Float.parseFloat(fields[4]));
                phone.setPrice(Float.parseFloat(fields[5]));
                phones.add(phone);
            }
            br.close();
            return phones;
        }catch (Exception e){
            e.printStackTrace();
        }
        return phones;
    }

    public static void writePhonesToFile(List<MobilePhone> phones){
        final String FILEPATH = "Files/Phones.csv";
        final String SEPARATOR = ",";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH))){
            bw.write(headline());
            for(MobilePhone phone : phones){
                bw.newLine();
                bw.write(phone.getManufacturer() + SEPARATOR);
                bw.write(phone.getModel() + SEPARATOR);
                bw.write(phone.getScreenSize() + SEPARATOR);
                bw.write(phone.getYearOfProduction() + SEPARATOR);
                bw.write(phone.getBatteryCapacity() + SEPARATOR);
                bw.write(phone.getPrice() + SEPARATOR);
            }
            bw.close();
            System.out.println("Phones written to " + FILEPATH);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static String headline(){
        return "Manufacturer,Model,Screen,Year,Battery,Price" ;
    }

    private static void fillData(List<MobilePhone> phones){
        phones.add(new MobilePhone("Apple", "iPhone 13", 6.1f, 2021, 3095f, 799f));
        phones.add(new MobilePhone("Samsung", "Galaxy S21", 6.2f, 2021, 4000f, 699f));
        phones.add(new MobilePhone("Google", "Pixel 6", 6.4f, 2021, 4614f, 599f));
        phones.add(new MobilePhone("OnePlus", "9 Pro", 6.7f, 2021, 4500f, 729f));
        phones.add(new MobilePhone("Xiaomi", "Mi 11", 6.81f, 2021, 4600f, 749f));
        phones.add(new MobilePhone("Sony", "Xperia 5 III", 6.1f, 2021, 4500f, 999f));
        phones.add(new MobilePhone("Huawei", "P40 Pro", 6.58f, 2020, 4200f, 899f));
        phones.add(new MobilePhone("Motorola", "Edge 20", 6.7f, 2021, 4000f, 499f));
        phones.add(new MobilePhone("Nokia", "8.3 5G", 6.81f, 2020, 4500f, 599f));
        phones.add(new MobilePhone("Realme", "GT", 6.43f, 2021, 4500f, 429f));
        phones.add(new MobilePhone("Oppo", "Find X3 Pro", 6.7f, 2021, 4500f, 1149f));
        phones.add(new MobilePhone("Asus", "ROG Phone 5", 6.78f, 2021, 6000f, 999f));
        phones.add(new MobilePhone("Vivo", "X60 Pro+", 6.56f, 2021, 4200f, 899f));
        phones.add(new MobilePhone("LG", "Wing", 6.8f, 2020, 4000f, 999f));
        phones.add(new MobilePhone("Apple", "iPhone SE", 4.7f, 2020, 1821f, 399f));
        phones.add(new MobilePhone("Samsung", "Galaxy Note 20", 6.7f, 2020, 4300f, 999f));
        phones.add(new MobilePhone("Google", "Pixel 5", 6.0f, 2020, 4080f, 699f));
        phones.add(new MobilePhone("OnePlus", "Nord 2", 6.43f, 2021, 4500f, 399f));
        phones.add(new MobilePhone("Xiaomi", "Redmi Note 10 Pro", 6.67f, 2021, 5020f, 279f));
        phones.add(new MobilePhone("Sony", "Xperia 1 III", 6.5f, 2021, 4500f, 1299f));
    }
}
