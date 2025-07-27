package com.ecommerce.search;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product searchByName(Product[] products, String name) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
