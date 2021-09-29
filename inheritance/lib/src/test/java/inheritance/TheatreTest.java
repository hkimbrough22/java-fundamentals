package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TheatreTest {
    @Test
    void associationOfMovieToTheatre() {
        Theatre sut = new Theatre("Cinemax 10", 2);
        sut.addMovie("Terminator");
        sut.addMovie("Tropic Thunder");
        String actualAddResponse = sut.movies.get(0);
        String expectedAddResponse = "Terminator";
//        System.out.println(actualResponse);
        assertEquals(expectedAddResponse, actualAddResponse);
        sut.removeMovie("Terminator");
        String actualRemoveResponse = sut.movies.get(0);
        String expectedRemoveResponse = "Tropic Thunder";
        assertEquals(expectedRemoveResponse, actualRemoveResponse);
    }

    @Test
    void addReviewWithMovie() {
        Theatre sut = new Theatre("Cinemax 10", 2);
        sut.addMovie("Terminator");
        Review sutReview = new Review(sut, "Terminator", "The movie was awesome! So much action!", "Haustin Kimbrough", 5);
        sut.addReview(sutReview);
        String actualResponse = sut.reviews.get(0).toString();
//        System.out.println(actualResponse);
        String expectedResponse = "Movie: Terminator\n" +
                "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: The movie was awesome! So much action!\n" +
                "Author: Haustin Kimbrough";
        assertEquals(expectedResponse, actualResponse);

    }

    @Test
    void addReviewWithoutMovie() {
        Theatre sut = new Theatre("Cinemax 10", 2);
        sut.addMovie("Terminator");
        Review sutReview = new Review(sut, "The movie was awesome! So much action!", "Haustin Kimbrough", 5);
        sut.addReview(sutReview);
        String actualResponse = sut.reviews.get(0).toString();
//        System.out.println(actualResponse);
        String expectedResponse = "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: The movie was awesome! So much action!\n" +
                "Author: Haustin Kimbrough";
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void updateRatingWithMoreReviews() {
        Theatre sut = new Theatre("Cinemax 10", 2);
        sut.addMovie("Terminator");
        sut.addMovie("Pokemon: The Movie");
        sut.addMovie("Tropic Thunder");
        Review sutReview = new Review(sut, "Terminator", "The movie was awesome! So much action!", "Haustin Kimbrough", 5);
        sut.addReview(sutReview);
        assertEquals(5.0, sut.stars);
        Review sutReview2 = new Review(sut, "Tropic Thunder", "I'd like my money back! Terrible movie!", "Haustin Kimbrough", 2);
        sut.addReview(sutReview2);
        assertEquals(3.5, sut.stars);
        Review sutReview3 = new Review(sut, "The theatre smelled like moldy tacos!", "Haustin Kimbrough", 0);
        sut.addReview(sutReview3);
        assertEquals(2.3333333333333335, sut.stars);
    }

    @Test
    void movieReviewedIsBeingPlayedAtTheatre() {
        Theatre sut = new Theatre("Cinemax 10", 2);
        sut.addMovie("Terminator");
        Review sutReview = new Review(sut, "Tropic Thunder", "The movie was awesome! So much action!", "Haustin Kimbrough", 5);
        assertThrows(IllegalArgumentException.class, () -> sut.addReview(sutReview));
    }

    @Test
    void turnTheatreToString() {
        Theatre sut = new Theatre("Cinemax 10", 2);
        sut.addMovie("Terminator");
        sut.addMovie("Pokemon: The Movie");
        sut.addMovie("Tropic Thunder");
        Review sutReview = new Review(sut, "Terminator", "The movie was awesome! So much action!", "Haustin Kimbrough", 5);
        Review sutReview2 = new Review(sut, "Tropic Thunder", "I'd like my money back! Terrible movie!", "Haustin Kimbrough", 2);
        Review sutReview3 = new Review(sut, "The theatre smelled like moldy tacos!", "Haustin Kimbrough", 0);
        sut.addReview(sutReview);
        sut.addReview(sutReview2);
        sut.addReview(sutReview3);
        String actualResponse = sut.toString();
        String expectedResponse = "Theatre Name: Cinemax 10\n" +
                "Rating: 2.3333333333333335\n" +
                "Cost: $$\n" +
                "Current Movies: Terminator\n" +
                "----------------------------\n" +
                "Pokemon: The Movie\n" +
                "----------------------------\n" +
                "Tropic Thunder\n" +
                "----------------------------\n" +
                "\n" +
                "---Reviews---\n" +
                "Movie: Terminator\n" +
                "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
                "Review: The movie was awesome! So much action!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n" +
                "Movie: Tropic Thunder\n" +
                "Rating: ⭐️⭐️\n" +
                "Review: I'd like my money back! Terrible movie!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n" +
                "Rating: \n" +
                "Review: The theatre smelled like moldy tacos!\n" +
                "Author: Haustin Kimbrough\n" +
                "----------------------------\n" +
                "----------------------------";
        assertEquals(expectedResponse, actualResponse);
    }
//    Theatre sut = new Theatre("Cinemax 10", 2);
//        sut.addMovie("Terminator");
//        sut.addMovie("Pokemon: The Movie");
//        sut.addMovie("Tropic Thunder");
//    Review sutReview = new Review(sut,"Terminator", "The movie was awesome! So much action!", "Haustin Kimbrough", 5);
//    Review sutReview2 = new Review(sut, "Tropic Thunder","I'd like my money back! Terrible movie!", "Haustin Kimbrough", 2);
//    Review sutReview3 = new Review(sut,"The theatre smelled like moldy tacos!", "Haustin Kimbrough", 0);
//        sut.addReview(sutReview);
//        sut.addReview(sutReview2);
//        sut.addReview(sutReview3);
//    String actualResponse = sut.toString();
//    String expectedResponse = "Theatre Name: Cinemax 10\n" +
//            "Rating: 2.3333333333333335\n" +
//            "Cost: $$\n" +
//            "Current Movies: Terminator\n" +
//            "----------------------------\n" +
//            "Pokemon: The Movie\n" +
//            "----------------------------\n" +
//            "Tropic Thunder\n" +
//            "----------------------------\n" +
//            "\n" +
//            "---Reviews---\n" +
//            "Movie: Terminator\n" +
//            "Rating: ⭐️⭐️⭐️⭐️⭐️\n" +
//            "Review: The movie was awesome! So much action!\n" +
//            "Author: Haustin Kimbrough\n" +
//            "----------------------------\n" +
//            "Movie: Tropic Thunder\n" +
//            "Rating: ⭐️⭐️\n" +
//            "Review: I'd like my money back! Terrible movie!\n" +
//            "Author: Haustin Kimbrough\n" +
//            "----------------------------\n" +
//            "Rating: \n" +
//            "Review: The theatre smelled like moldy tacos!\n" +
//            "Author: Haustin Kimbrough\n" +
//            "----------------------------\n" +
//            "----------------------------";
}
