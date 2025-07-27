package com.ecommerce.search;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Shirt", "Clothing")
        };

        String searchName = "Watch";

        System.out.println("🔍 Linear Search:");
        Product result1 = LinearSearch.searchByName(products, searchName);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n🔍 Binary Search:");
        Product result2 = BinarySearch.searchByName(products, searchName);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

