package JavaAdvCoding.RealEstate;

import java.util.Date;
import java.util.Objects;

public class Property {
    private String ID;
    private PropertyType propertyType;
    private ApartmentType apartmentType;
    private String city;
    private String neighborhood;
    private String address;
    private ListingType listingType;
    private int area;
    private int price;
    private float pricePerSquare;
    private boolean hasFurniture;
    private boolean needsInvestment;
    private boolean availableNow;
    private Date availableDate;
    private Date publishedDate;

    public Property(String ID, PropertyType propertyType, ApartmentType apartmentType,
                    String city, String neighborhood, String address,
                    ListingType listingType, int area, int price, float pricePerSquare,
                    boolean hasFurniture, boolean needsInvestment, boolean availableNow,
                    Date availableDate, Date publishedDate) {
        this.ID = ID;
        this.propertyType = propertyType;
        this.apartmentType = apartmentType;
        this.city = city;
        this.neighborhood = neighborhood;
        this.address = address;
        this.listingType = listingType;
        this.area = area;
        this.price = price;
        this.pricePerSquare = pricePerSquare;
        this.hasFurniture = hasFurniture;
        this.needsInvestment = needsInvestment;
        this.availableNow = availableNow;
        this.availableDate = availableDate;
        this.publishedDate = publishedDate;
    }

    public Property(){}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ListingType getListingType() {
        return listingType;
    }

    public void setListingType(ListingType listingType) {
        this.listingType = listingType;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getPricePerSquare() {
        return pricePerSquare;
    }

    public void setPricePerSquare(float pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    public void setHasFurniture(boolean hasFurniture) {
        this.hasFurniture = hasFurniture;
    }

    public boolean isNeedsInvestment() {
        return needsInvestment;
    }

    public void setNeedsInvestment(boolean needsInvestment) {
        this.needsInvestment = needsInvestment;
    }

    public boolean isAvailableNow() {
        return availableNow;
    }

    public void setAvailableNow(boolean availableNow) {
        this.availableNow = availableNow;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Property{" +
                "ID='" + ID + '\'' +
                ", propertyType=" + propertyType +
                ", apartmentType=" + apartmentType +
                ", city='" + city + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", address='" + address + '\'' +
                ", listingType=" + listingType +
                ", area=" + area +
                ", price=" + price +
                ", pricePerSquare=" + pricePerSquare +
                ", hasFurniture=" + hasFurniture +
                ", needsInvestment=" + needsInvestment +
                ", availableNow=" + availableNow +
                ", availableDate=" + availableDate +
                ", publishedDate=" + publishedDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return area == property.area && price == property.price && Float.compare(pricePerSquare, property.pricePerSquare) == 0 && hasFurniture == property.hasFurniture && needsInvestment == property.needsInvestment && availableNow == property.availableNow && Objects.equals(ID, property.ID) && propertyType == property.propertyType && apartmentType == property.apartmentType && Objects.equals(city, property.city) && Objects.equals(neighborhood, property.neighborhood) && Objects.equals(address, property.address) && listingType == property.listingType && Objects.equals(availableDate, property.availableDate) && Objects.equals(publishedDate, property.publishedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, propertyType, apartmentType, city, neighborhood, address, listingType, area, price, pricePerSquare, hasFurniture, needsInvestment, availableNow, availableDate, publishedDate);
    }
}
