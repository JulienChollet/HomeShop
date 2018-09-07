package com.chollet.homeshop;

public class ExpressDelivery implements Delivery {

    private String city;

    public ExpressDelivery(String city) {

        this.city = city;
    }

    @Override
    public double getPrice() {
        if( city == "Paris")
            return 6.99;
        else
            return 9.99;

    }
}
