package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {
    @Test
    void createRestaurantReview(){
        Review sut = new Review(new Restaurant("Chick-Fil-A", 2), "Chick-Fil-A is bomb!", "Haustin Kimbrough", 5);
        String actualBody = sut.body;
        String actualAuthor = sut.author;
        int actualRating = sut.stars;
        String expectedBody = "Chick-Fil-A is bomb!";
        String expectedAuthor = "Haustin Kimbrough";
        int expectedRating = 5;
        assertEquals(expectedRating, actualRating);
        assertEquals(expectedAuthor, actualAuthor);
        assertEquals(expectedBody, actualBody);
    }

    @Test
    void createShopReview(){
        Review sut = new Review(new Shop("BlockBuster", "movies, games, late fees - all in one!", 2), "Drove all the " +
                "way here and it was permanently closed! Waste of time!", "Haustin Kimbrough", 1);
        String actualBody = sut.body;
        String actualAuthor = sut.author;
        int actualRating = sut.stars;
        String expectedBody = "Drove all the way here and it was permanently closed! Waste of time!";
        String expectedAuthor = "Haustin Kimbrough";
        int expectedRating = 1;
        assertEquals(expectedRating, actualRating);
        assertEquals(expectedAuthor, actualAuthor);
        assertEquals(expectedBody, actualBody);
    }

    @Test
    void turnReviewToString(){
        Review sut = new Review(new Restaurant("Chick-Fil-A", 2), "Chick-Fil-A is bomb!", "Haustin Kimbrough", 5);
        String actualReview = sut.toString();
        String expectedReview = "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: Chick-Fil-A is bomb!\n" +
                "Author: Haustin Kimbrough";
//        System.out.println(actualReview);
        assertEquals(expectedReview, actualReview);
    }

    @Test
    void properStarReviewRating() {
//        Review sut = new Review( new Restaurant("Chick-Fil-A", 2 ),"Is AWESOME", "Haustin", 10);
        assertThrows(IllegalArgumentException.class, () -> new Review( new Restaurant("Chick-Fil-A", 2 ),"Is AWESOME", "Haustin", 10));
        assertThrows(IllegalArgumentException.class, () -> new Review( new Restaurant("Chick-Fil-A", 2 ),"Is AWESOME", "Haustin", -3));
    }
}
