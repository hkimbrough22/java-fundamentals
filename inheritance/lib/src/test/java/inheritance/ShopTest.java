package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    @Test
    void turnShopToString(){
        Shop sut = new Shop("Blockbuster", "movies, games, late fees - all in one!", 1);
        String actualShop = sut.toString();
        String expectedShop = "Name: Blockbuster\n" +
                "Description: movies, games, late fees - all in one!\n" +
                "Cost Category: $";
        assertEquals(expectedShop, actualShop);
    }

    @Test
    void addReviewAssociationToShop() {
        Shop sut = new Shop("Blockbuster", "movies, games, late fees - all in one!", 1);
        Review sutReview = new Review(sut, "Drove all the way here and it was permanently closed! Waste of time!",
                "Haustin Kimbrough", 1);
        Review sutReview2 = new Review(sut, "We found the last BlockBuster still in business!",
                "Haustin Kimbrough", 5);
        sut.addReview(sutReview);
        sut.addReview(sutReview2);
        String expectedString = "Rating: ⭐️\n" +
                "Review: Drove all the way here and it was permanently closed! Waste of time!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n" +
                "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: We found the last BlockBuster still in business!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n";
        String actualString = "";
        for(int i = 0; i < sut.reviews.size(); i++) {
            actualString += "" + sut.reviews.get(i).toString() +"\n----------------------------\n";
        }
//        System.out.println(actualString);
        assertEquals(expectedString, actualString);
    }

    @Test
    void properPriceCatRating() {
        assertThrows(IllegalArgumentException.class, () -> new Shop("Blockbuster", "movies, games, late fees - all in" +
                " one!", 10));
    }
}
