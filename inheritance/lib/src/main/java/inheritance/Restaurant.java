package inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    double stars;
    int priceCat;
    List<Review> reviews = new ArrayList<>();
    int reviewCount;

    Restaurant(String _name, int _priceCat) {
        this.name = _name;
        this.stars = 0;
        this.priceCat = _priceCat;
    }

    @Override
    public String toString(){
        String string;
        String reviewString = "";
        double starRating = this.stars;
        String priceRating = "$";
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
        reviewCount = reviews.size();
        int totalStars = 0;
        for(int i = 0; i < reviewCount; i++) {
            totalStars += reviews.get(i).stars;
        }
        this.stars = (double) totalStars / reviewCount;
        System.out.println(this.stars);
    }

}
