package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    @Test
    void createShop() {
        Shop sut = new Shop("Blockbuster", "movies, games, late fees - all in one!", 1);
        assertTrue((sut instanceof Shop));
    }

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
    void properPriceCatRating() {
        assertThrows(IllegalArgumentException.class, () -> new Shop("Blockbuster", "movies, games, late fees - all in" +
                " one!", 10));
    }
}
