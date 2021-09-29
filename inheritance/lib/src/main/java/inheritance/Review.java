package inheritance;

public class Review {
    Business business;
    String body;
    String author;
    int stars;
    String movie;

    Review(Business _business, String _body, String _author, int _stars) {
        this(_business, null, _body, _author, _stars);
    }

    Review(Business _business, String _movie, String _body, String _author, int _stars){
        this.business = _business;
        this.body = _body;
        this.author = _author;
        if(_stars < 0 || _stars > 5) {
            throw new IllegalArgumentException("Your star rating must be between 0 and 5.");
        }
        this.stars = _stars;
        this.movie = _movie;
    }

    @Override
    public String toString(){
        String string = "";
        String starRating = "⭐️";
        starRating = starRating.repeat(stars);
        if(movie == null){
            string = "Rating: " +starRating+ "\nReview: " +body+ "\nAuthor: " +author;
        } else {
            string = "Movie: " + movie + "\nRating: " +starRating+ "\nReview: " +body+ "\nAuthor: " +author;
        }
        return string;
    }
}
