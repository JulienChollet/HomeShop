package com.chollet.homeshop;

public class Television extends Product {
    private int size;
    private String slabType;

    public Television(String name, String descripton, double price, int size, String slabType) {
        super(name, descripton, price);
        this.size = size;
        this.slabType = slabType;
    }

    public int getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }
}
