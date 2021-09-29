package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Business implements Reviewable {
    String description;

    Shop(String _name, String _description, int _priceCat) {
        this.name = _name;
        this.description = _description;
        if(_priceCat < 0 || _priceCat > 5) {
            throw new IllegalArgumentException("Your price rating must be between 0 and 5.");
        }
        this.priceCat = _priceCat;
    }

    @Override
    public String toString(){
        String costCat = "$";
        costCat = costCat.repeat(priceCat);
        String string = "Name: " +name+ "\nDescription: " +description+ "\nCost Category: " +costCat;
        return string;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
        reviewCount = reviews.size();
        int totalStars = 0;
        for(int i = 0; i < reviewCount; i++) {
            totalStars += reviews.get(i).stars;
        }
        this.stars = (double) totalStars / reviewCount;
//        System.out.println(this.stars);
    }
}
