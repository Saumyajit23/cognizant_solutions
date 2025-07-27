package com.ecommerce.search;

public class LinearSearch {
    public static Product searchByName(Product[] products, String name) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}
