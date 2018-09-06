package com.chollet.homeshop;

public class Fridge extends Product{
    private int liter;
    private boolean freezer;

    public Fridge(String name, String descripton, double price, int liter, boolean freezer) {
        super(name, descripton, price);
        this.liter = liter;
        this.freezer = freezer;
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }
}
