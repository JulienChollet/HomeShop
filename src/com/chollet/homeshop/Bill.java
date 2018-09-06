package com.chollet.homeshop;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;

    public Bill(Customer customer) {
        this.customer = customer;
}

    /**
     * Add product with quantity in the bill
     * @param product product add
     * @param quantity product quantity
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
