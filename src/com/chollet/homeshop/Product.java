package com.chollet.homeshop;

public class Product {

    private String name;
    private String descripton;
    private double price;

    public Product(String name, String descripton, double price) {
        this.name = name;
        this.descripton = descripton;
        this.price = price;
    }

    /**
     * Display the description of the product
     */
    public void look(){

    }

    /**
     * add the product to the Bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill, Integer quantity){

    }

    public String getName() {
        return name;
    }


    public String getDescripton() {
        return descripton;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
