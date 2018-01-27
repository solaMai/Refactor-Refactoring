package com.refactor.mini_project;

public class NewReleasePrice extends Price {
    @Override
    public double getAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return 2;
        return 1;
    }


}
