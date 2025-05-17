package JavaAdv.Exercises.Collections.Task2;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private char gender;
    private int yearOfBirth;

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String surname, char gender, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public Author(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender && yearOfBirth == author.yearOfBirth && Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, yearOfBirth);
    }

    @Override
    public String toString() {
        return  name + '\t' + surname + '\t' + gender + '\t' + yearOfBirth;
    }
}
