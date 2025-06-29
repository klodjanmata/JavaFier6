package JavaAdvCoding.RealEstate;

import JavaAdvCoding.Exercise12_13.EngineType;

public enum PropertyType {
    APARTMENT,
    PENTHOUSE,
    VILA,
    WAREHOUSE,
    BUSINESS,
    LAND,
    HOTEL;

    public static String printString() {
        String result = "[";
        for (PropertyType pt : PropertyType.values()) {
            result += pt + ", ";
        }
        result += "]";
        return result;
    }
}
