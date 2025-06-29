package JavaAdvCoding.RealEstate;

import java.util.List;

public class EstateService {
    private List<Property> properties;
    private final PropertyCsvUtil propertyCsvUtil = new PropertyCsvUtil();

    public void printProperties(List<Property> propertiesList) {
        System.out.println(propertyCsvUtil.header());
        if (propertiesList == null || propertiesList.isEmpty()) {
            System.out.println("No properties to print");
            return;
        }
        for (Property p : propertiesList) {
            System.out.println(p.fileWritingFormat());
        }
    }

    public void addNewProperty(Property property) {
        properties.add(property);
    }

    public EstateService() {
        this.properties = initProperties();
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Property> initProperties(){
        return propertyCsvUtil.readFile();
    }

    public void saveProperties(){
        propertyCsvUtil.writeToFile(properties);
    }

    public PropertyCsvUtil getPropertyCsvUtil() {
        return propertyCsvUtil;
    }
}
