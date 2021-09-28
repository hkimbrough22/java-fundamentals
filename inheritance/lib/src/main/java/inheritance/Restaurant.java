package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    int stars;
    int priceCat;
    List<Review> reviews = new ArrayList<>();

    Restaurant(String _name, int _stars, int _priceCat) {
        this.name = _name;
        this.stars = _stars;
        this.priceCat = _priceCat;
    }

    @Override
    public String toString(){
        String string = "";
        String reviewString = "";
        String starRating = "⭐️";
        String priceRating = "$";
        starRating = starRating.repeat(this.stars);
        priceRating = priceRating.repeat(this.priceCat);
        for(int i = 0; i < reviews.size(); i++) {
            reviewString += "" + reviews.get(i).toString() + "\n----------------------------\n";
        }
//        System.out.println(reviewString);
        string = "Restaurant Name: " + this.name + "\nRating: " +starRating+ "\nCost: " +priceRating+ "\n---Reviews---\n" + reviewString+ "----------------------------";
        return string;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

}
