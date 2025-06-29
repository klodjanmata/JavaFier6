package JavaAdvCoding.Exercise12_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CarsCsvUtil {
    private final String FILEPATH = "Files/Cars/Cars.csv";
    private final String SEPARATOR = ",";

    public void writeToFile(List<Car> cars){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH))){
            bw.write(header());
            for(Car c : cars){
                bw.newLine();
                bw.write(c.fileWritingFormat());
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Car> readFromFile(){
        List<Car> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILEPATH))){
            br.readLine();  // Skipping first Line (Header)
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(SEPARATOR);
                Car c = new Car();
                c.setName(parts[0]);
                c.setModel(parts[1]);
                c.setPrice(Integer.parseInt(parts[2].trim()));
                c.setYear(Integer.parseInt(parts[3].trim()));
                Manufacturer m = new Manufacturer();
                m.setName(parts[4]);
                m.setCountry(parts[5]);
                m.setYearOfEstablishment(Integer.parseInt(parts[6].trim()));
                c.setManufacturer(m);
                c.setEngineType(EngineType.valueOf(parts[7].trim()));
                result.add(c);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String header(){
        return "Name\tModel\tPrice\tYear\tProdName\tProdCountry\tProdYearOfEst\tEngineType";
    }
}
