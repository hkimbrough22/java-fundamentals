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
        if(_stars < 0 || _stars > 5) {
            throw new IllegalArgumentException("Your star rating must be between 0 and 5.");
        }
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
