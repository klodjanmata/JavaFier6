package JavaAdvCoding.RealEstate;

public enum ListingType {
    RENT,
    SALE;

    public static String printString() {
        String result = "[";
        for (ListingType type : values()) {
            result += type + ", ";
        }
        result += "]";
        return result;
    }
}
