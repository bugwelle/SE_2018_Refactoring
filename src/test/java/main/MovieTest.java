package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {
    private final Movie movie = new Movie("Jurassic Park", Movie.REGULAR);

    @Test
    public void getPriceCodeTest() {
        assertEquals(movie.getPriceCode(), Movie.REGULAR);
    }

    @Test
    public void getTitleTest() {
        assertEquals(movie.getTitle(), "Jurassic Park");
    }

    @Test
    public void setPriceCodeTest() {
        movie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(movie.getPriceCode(), Movie.NEW_RELEASE);
    }

}
