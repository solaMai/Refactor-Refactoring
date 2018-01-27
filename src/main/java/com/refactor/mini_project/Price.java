package com.refactor.mini_project;

public abstract class Price {

    public abstract double getAmount(int daysRented);

    public abstract int getFrequentRenterPoints(int daysRented);

    public static  Price newInstance(int moviceType) {
        if (moviceType == Movie.REGULAR) {
            return new RegularPrice();
        } else if (moviceType == Movie.NEW_RELEASE) {
            return new NewReleasePrice();
        } else if (moviceType == Movie.CHILDREN) {
            return new ChildrenPrice();
        }else{
            throw new RuntimeException("Error Price Code");
        }
    }
}
