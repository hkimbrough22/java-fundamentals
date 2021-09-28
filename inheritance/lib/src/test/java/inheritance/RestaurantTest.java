package inheritance;

import org.apache.commons.math3.random.RandomVectorGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {
    @Test
    void createRestaurant() {
        Restaurant sut = new Restaurant("Chili's", 2);
        assertTrue(sut.name.equals("Chili's"));
        assertTrue(sut.priceCat == 2);
    }

    @Test
    void turnRestaurantToString() {
        Restaurant sut = new Restaurant("Chick-Fil-A", 2);
        Review sutReview = new Review(sut, "Chick-Fil-A is bomb!", "Haustin Kimbrough", 5);
        Review sutReview2 = new Review(sut, "Chick-Fil-A is trash!", "Haustin Kimbrough", 0);
        sut.addReview(sutReview);
        sut.addReview(sutReview2);
        String actualResponse = sut.toString();
        String expectedResponse = "Restaurant Name: Chick-Fil-A\n" +
                "Rating: 2.0\n" +
                "Cost: $$\n" +
                "---Reviews---\n" +
                "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: Chick-Fil-A is bomb!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n" +
                "Rating: \n" +
                "Review: Chick-Fil-A is trash!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n" +
                "----------------------------";
//        System.out.println(actualResponse);
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void addReviewAssociationToRestaurant() {
        Restaurant sut = new Restaurant("Chick-Fil-A", 2);
        Review sutReview = new Review(sut, "Chick-Fil-A is bomb!", "Haustin Kimbrough", 5);
        Review sutReview2 = new Review(sut, "Chick-Fil-A is trash!", "Haustin Kimbrough", 0);
        sut.addReview(sutReview);
        sut.addReview(sutReview2);
        String expectedString = "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: Chick-Fil-A is bomb!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n" +
                "Rating: \n" +
                "Review: Chick-Fil-A is trash!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n";
        String actualString = "";
        for(int i = 0; i < sut.reviews.size(); i++) {
            actualString += "" + sut.reviews.get(i).toString() +"\n----------------------------\n";
        }
        assertEquals(expectedString, actualString);
    }

    @Test
    void changeStarRatingWithMoreReviews() {
        Restaurant sut = new Restaurant("Chick-Fil-A", 2);
        Review sutReview = new Review(sut, "Chick-Fil-A is bomb!", "Haustin Kimbrough", 5);
        sut.addReview(sutReview);
        assertEquals(5.0, sut.stars);
        Review sutReview2 = new Review(sut, "Chick-Fil-A is trash!", "Haustin Kimbrough", 0);
        sut.addReview(sutReview2);
        assertEquals(2.5, sut.stars);
        Review sutReview3 = new Review(sut, "Chick-Fil-A is pretty good!", "Haustin Kimbrough", 4);
        sut.addReview(sutReview3);
        assertEquals(3.0, sut.stars);
    }
}
