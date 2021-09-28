package inheritance;

import org.apache.commons.math3.random.RandomVectorGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {
    @Test
    void createRestaurant() {
        Restaurant sut = new Restaurant("Chili's", 3, 2);
        assertTrue(sut.name == "Chili's");
        assertTrue(sut.stars == 3);
        assertTrue(sut.priceCat == 2);
    }

    @Test
    void turnRestaurantToString() {
        Restaurant sut = new Restaurant("Chick-Fil-A", 5, 2);
        Review sutReview = new Review(sut, "Chick-Fil-A is bomb!", "Haustin Kimbrough", 5);
        sut.addReview(sutReview);
        String actualResponse = sut.toString();
        String expectedResponse = "Restaurant Name: Chick-Fil-A\n" +
                "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
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
        Restaurant sut = new Restaurant("Chick-Fil-A", 5, 2);
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
}
