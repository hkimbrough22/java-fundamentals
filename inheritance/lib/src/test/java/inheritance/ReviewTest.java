package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {
    @Test
    void createReview(){
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
    void turnReviewToString(){
        Review sut = new Review(new Restaurant("Chick-Fil-A", 2), "Chick-Fil-A is bomb!", "Haustin Kimbrough", 5);
        String actualReview = sut.toString();
        String expectedReview = "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: Chick-Fil-A is bomb!\n" +
                "Author: Haustin Kimbrough";
//        System.out.println(actualReview);
        assertEquals(expectedReview, actualReview);
    }
}
