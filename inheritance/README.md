# Inheritance
**Author**: Haustin Kimbrough

## Features
#### Business
Parent class of all the other different classes. Sets up standard for Restaurant, Shop, and Theatre. Gives a name, stars, price category, review count, ArrayList of Reviews, and an addReview method.
#### Reviewable
Interface that ties to all children of Business. Requires an addReview method for all implementations.
#### Restaurant
Set up constructor with name and price category. Has two methods - a .toString() that overrides super class and an addReview().
#### Shop
Set up constructor with name, description, and price category. Has two methods - a .toString() that overrides super class and an addReview().
#### Theatre
Set up constructor with name and price category. Has four methods- a .toString() that overrides super class, an .addReview() method, an .addMovie() method that associates a movie to a theatre, and a .removeMovie() method that removes that association from the theatre.
#### Review
Sets up a constructor that generates and associates a review to a particular business(Restaurant, Shop, or Theatre). If the review is pertaining to a Theatre, another parameter of "movie" is offered, but still not required.

[Back to Main README](../README.md)