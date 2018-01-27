package com.refactor.mini_project;

class Rental {

    private Movie movie;
    private int daysRented;
    private Price price;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.price = Price.newInstance(movie.getType());
    }

    Movie getMovie() {
        return movie;
    }

    int getFrequentRenterPoints() {
       return price.getFrequentRenterPoints(daysRented);
    }

    double getAmount() {
        return price.getAmount(daysRented);
    }

}
