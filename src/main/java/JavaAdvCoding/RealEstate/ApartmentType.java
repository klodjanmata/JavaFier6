package JavaAdvCoding.RealEstate;

public enum ApartmentType {
    ONE_PLUS_ONE("1+1"),
    TWO_PLUS_ONE("2+1"),
    THREE_PLUS_ONE("3+1"),
    STUDIO("0+1"),
    DUPLEX("");

    private String label;

    ApartmentType(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static ApartmentType searchLabel(String label) {
        for (ApartmentType type : values()) {
            if (type.label.equals(label)) {
                return type;
            }
        }
        return null;
    }
}
