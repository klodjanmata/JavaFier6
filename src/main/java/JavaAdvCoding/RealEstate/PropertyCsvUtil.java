package JavaAdvCoding.RealEstate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PropertyCsvUtil {
    private final String FILEPATH = "Files/RealEstate/Properties.CSV";
    private final String SEPARATOR = ",";
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");

    public List<Property> readFile(){
        List<Property> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILEPATH))){
            br.readLine();  // Skipping first Line (Header)
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(SEPARATOR);
                Property p = new Property();
                p.setID(parts[0]);
                p.setPropertyType(PropertyType.valueOf(parts[1]));
                p.setApartmentType(ApartmentType.valueOf(parts[2]));
                p.setCity(parts[3]);
                p.setNeighborhood(parts[4]);
                p.setAddress(parts[5]);
                p.setListingType(ListingType.valueOf(parts[6]));
                p.setArea(Integer.parseInt(parts[7]));
                p.setPrice(Integer.parseInt(parts[8]));
                p.setPricePerSquare(Float.parseFloat(parts[9]));
                p.setHasFurniture(Boolean.parseBoolean(parts[10]));
                p.setNeedsInvestment(Boolean.parseBoolean(parts[11]));
                p.setAvailableNow(Boolean.parseBoolean(parts[12]));
                p.setAvailableDate(sdf.parse(parts[13]));
                p.setPublishedDate(sdf.parse(parts[14]));
                result.add(p);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    public void writeToFile(List<Property> properties){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH))){
            bw.write(header());
            for(Property p : properties){
                bw.newLine();
                bw.write(p.fileWritingFormat());
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String header(){
        return "ID\tPropertyType\tApartmentType\tCity\tNeighborhood\tAddress\t" +
            "ListingType\tArea\tPrice\tPricePerSquare\tHasFurniture\tNeedsInvestment\t" +
            "AvailableNow\tAvailableDate\tPublishedDate";
    }
}
