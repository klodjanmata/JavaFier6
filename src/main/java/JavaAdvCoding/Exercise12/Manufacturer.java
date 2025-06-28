package JavaAdvCoding.Exercise12;

import java.util.Objects;

public class Manufacturer {
    private String Name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer() {}

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        Name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "Name='" + Name + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && Objects.equals(Name, that.Name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, yearOfEstablishment, country);
    }
}
