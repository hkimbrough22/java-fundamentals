package inheritance;

import java.util.ArrayList;
import java.util.List;

public abstract class Business {
    String name;
    double stars = 0;
    int priceCat = 0;
    List<Review> reviews = new ArrayList<>();
    int reviewCount = 0;

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
