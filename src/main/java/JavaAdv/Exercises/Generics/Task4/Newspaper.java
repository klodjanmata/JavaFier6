package JavaAdv.Exercises.Generics.Task4;

import java.util.Date;

public class Newspaper extends Media{
    private String title;
    private Date date;

    public Newspaper(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
