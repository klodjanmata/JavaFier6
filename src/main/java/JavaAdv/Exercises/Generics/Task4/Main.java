package JavaAdv.Exercises.Generics.Task4;

import JavaAdv.Exercises.OOP.Task2.Person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MediaList<Media> mediaList = new MediaList<>();

        Book b = new Book("Sherlock Holmes", "Arthur Conan Doyle");
        Movie m = new Movie("Fast and Furious 10", 2025);
        Newspaper n = new Newspaper("Standard", new Date());
        mediaList.mediaList.add(b);
        mediaList.mediaList.add(n);
        mediaList.mediaList.add(m);

        for(Media media : mediaList.mediaList){
            System.out.println(media);
        }
    }
}
