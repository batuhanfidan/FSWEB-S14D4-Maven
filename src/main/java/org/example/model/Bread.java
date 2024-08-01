package org.example.model;

public class Bread extends ProductForSale {

    private double flourRatio;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Un oranı " + flourRatio);
    }
}
