package JavaAdv.Exercises.Collections.Task2;

import Helper.Helper;

import java.util.List;

public class AuthorService {
    private List<Author> authorList;

    public AuthorService(List<Author> authorList) {
        this.authorList = authorList;
    }

    public void addAuthor() {
        System.out.println("Enter author details");
        Author a = new Author();
        a.setName(Helper.getStringFromUser("Name: "));
        a.setSurname(Helper.getStringFromUser("Surname: "));
        a.setGender(Helper.getCharFromUser("Gender: "));
        a.setYearOfBirth(Helper.getIntFromUser("Year of birth: "));
        authorList.add(a);
        System.out.println("Author added");
    }
}
