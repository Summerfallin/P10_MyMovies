package sg.edu.rp.c346.mymovies;

/**
 * Created by 16003749 on 23/7/2018.
 */

public class movieItems {
    private String title;
    private int year;
    private String rate;
    private  String genre;
    private String date;
    private String theatre;
    private String description;
    private int rating;

    public movieItems(String title, int year, String rate, String genre, String date, String theatre, String description,int rating) {
        this.title = title;
        this.year = year;
        this.rate = rate;
        this.genre = genre;
        this.date = date;
        this.theatre = theatre;
        this.description = description;
        this.rating=rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "movieItems{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rate='" + rate + '\'' +
                ", genre='" + genre + '\'' +
                ", date='" + date + '\'' +
                ", theatre='" + theatre + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
