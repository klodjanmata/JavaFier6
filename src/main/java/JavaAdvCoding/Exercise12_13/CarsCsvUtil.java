package JavaAdvCoding.Exercise12_13;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
        return null;
    }

    public String header(){
        return "Name\tModel\tPrice\tYear\tProdName\tProdCountry\tProdYearOfEst\tEngineType";
    }
}
