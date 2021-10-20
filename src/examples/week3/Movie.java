package examples.week3;

public class Movie {
    private String title;
    private int year;
    private double rating;

    private static int count = 0;

    public Movie() {

    }

    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.setRating(rating);
        Movie.count++;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
        if (rating < 0) {
            this.rating = 0;
        }
        if (rating > 10) {
            this.rating = 10;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Movie: ").append(this.title);
        sb.append("(").append(this.year).append(")");
        sb.append("rating: ").append(this.rating);
        return sb.toString();
    }

    public static void main(String[] args) {
        final Movie myMovie = new Movie("The Terminator", 1984, 8.7);

        System.out.println(myMovie.toString());
    }
}
