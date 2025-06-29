package JavaAdvCoding.RealEstate;

import java.util.ArrayList;
import java.util.List;

public class EstateService {
    private List<Property> properties;

    public EstateService() {
        this.properties = new ArrayList<>();
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
