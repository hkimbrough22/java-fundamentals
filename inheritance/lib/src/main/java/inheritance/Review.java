package inheritance;

public class Review {
    Restaurant restaurant;
    String body;
    String author;
    int stars;

    Review(Restaurant _restaurant, String _body, String _author, int _stars){
        this.restaurant = _restaurant;
        this.body = _body;
        this.author = _author;
        this.stars = _stars;
    }

    @Override
    public String toString(){
        String starRating = "⭐️";
        starRating = starRating.repeat(stars);
        String string = "Rating: " +starRating+ "\nReview: " +body+ "\nAuthor: " +author;
        return string;
    }
}
