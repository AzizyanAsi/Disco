package disco.task2;

public class TvShow implements Comparable<TvShow> {
    private String title;
    private int rating;

    public TvShow(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return new StringBuilder("{").append(title)
                .append(" _ ")
                .append(rating)
                .append("}")
                .toString();
    }

    @Override
    public int compareTo(TvShow o) {
        return  this.rating-o.getRating();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
