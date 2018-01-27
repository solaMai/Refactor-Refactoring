package com.refactor.mini_project;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private final String NEW_LINE = "\n";
    private final String TAB = "\t";
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    String statement() {
        StringBuilder result = new StringBuilder();
        appendStatementHeader(result);
        appendMovieToStatement(this.rentals.elements(), result);
        appendStatementFooter(result);
        return result.toString();
    }

    private void appendStatementHeader(StringBuilder result) {
        result.append("Rental Record for " + getName() + NEW_LINE);
    }

    private void appendStatementFooter(StringBuilder result) {
        result.append(getTotalAmountStatement());
        result.append(getFrequentRenterPointsStatement());
    }


    private StringBuilder getFrequentRenterPointsStatement() {
        return new StringBuilder().append(getAllFrequentRenterPoints())
            .append(" frequent renter points");
    }

    private StringBuilder getTotalAmountStatement() {
        return new StringBuilder().append("Amount owed is ")
            .append(getTotalAmount())
            .append(NEW_LINE)
            .append("You earned ");
    }

    private void appendMovieToStatement(Enumeration<Rental> rentals, StringBuilder result) {
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result.append(TAB)
                .append(each.getMovie().getTitle())
                .append(TAB)
                .append(each.getAmount()).append(NEW_LINE);
        }
    }

    private double getTotalAmount() {
        Enumeration<Rental> rentals = this.rentals.elements();
        double totalAmount = 0;
        while (rentals.hasMoreElements()) {
            totalAmount += rentals.nextElement().getAmount();
        }
        return totalAmount;
    }

    private int getAllFrequentRenterPoints() {
        Enumeration<Rental> rentals = this.rentals.elements();
        int frequentRenterPoints = 0;
        while (rentals.hasMoreElements()) {
            frequentRenterPoints += rentals.nextElement().getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

}
