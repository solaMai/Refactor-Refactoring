package com.refactor.mini_project;

public class RegularPrice extends Price {
    @Override
    public double getAmount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
