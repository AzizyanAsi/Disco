package disco.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestMain {
    public static void main(String[] args) {
        Cartoon c1 = new Cartoon("SpiderMan", 5);
        Cartoon c2 = new Cartoon("Lolita", 3);
        Cartoon c3 = new Cartoon("Tom & Jerry", 9);
        Cartoon c4 = new Cartoon("Masha & Bear", 8);
        Cartoon c5 = new Cartoon("Frozen", 10);
        Cartoon c6 = new Cartoon("Soul", 10);
        Movie m1 = new Movie("Pursuit Of Happiness", 10);
        Movie m2 = new Movie("My blind date with life ", 10);
        Movie m3 = new Movie("Harry Potter", 10);
        Movie m4 = new Movie("The invisible guest", 10);
        Movie m5 = new Movie("Second act", 9);


        ArrayList<TvShow> tvShows = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5, c6, m1, m2, m3, m4, m5));
        ArrayList<Movie> movies = new ArrayList<>();
        int max = 0;

        Iterator<TvShow> iterator = tvShows.iterator();
        while (iterator.hasNext()) {
            TvShow next = iterator.next();
            if (next instanceof Movie) {
                movies.add((Movie) next);
//                max=next.getRating();

            }

        }
        Movie movieMax = Collections.max(movies);

        for (Movie x : movies) {
            if (x.getRating() == movieMax.getRating()) {
                System.out.println(x.getTitle());
            }
        }


    }
}

