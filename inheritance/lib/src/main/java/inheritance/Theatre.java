package inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Theatre extends Business implements Reviewable{
    List<String> movies = new ArrayList<>();

    Theatre(String _name, int _priceCat){
        this.name = _name;
        this.priceCat = _priceCat;
        this.stars = 0;
        this.reviewCount = 0;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    @Override
    public String toString(){
        String string;
        String reviewString = "";
        String movieString = "";
        double starRating = this.stars;
        String priceRating = "$";
        priceRating = priceRating.repeat(this.priceCat);
        for(int i = 0; i < reviews.size(); i++) {
            reviewString += "" + reviews.get(i).toString() + "\n----------------------------\n";
        }
        for(int j = 0; j < movies.size(); j++){
            movieString += "" + movies.get(j) + "\n----------------------------\n";
        }
//        System.out.println(reviewString);
        string = "Theatre Name: " + this.name + "\nRating: " +starRating+ "\nCost: " +priceRating+ "\nCurrent Movies: " +movieString+ "\n---Reviews---\n" + reviewString+ "----------------------------";
        return string;
    }
    @Override
    public void addReview(Review review){
        if(movies.contains(review.movie) || review.movie == null){
        reviews.add(review);
        reviewCount = reviews.size();
        int totalStars = 0;
        for(int i = 0; i < reviewCount; i++) {
            totalStars += reviews.get(i).stars;
        }
        this.stars = (double) totalStars / reviewCount;
//        System.out.println(this.stars);
        } else {
            throw new IllegalArgumentException(review.movie + " isn't playing at " +this.name + "!");
        }
    }
}
