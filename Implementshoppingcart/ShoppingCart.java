package org.example.Day02.Implementshoppingcart;

import java.util.*;

class ShoppingCart {
    protected HashMap<String, Double> productPrices = new HashMap<>();
    protected LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();
    protected TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addItemToCart(String product, int quantity) {
        cartItems.put(product, quantity);
    }

    public void displayCartItems() {
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }

    public void displayItemsSortedByPrice() {
        sortedByPrice.clear();
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            double price = productPrices.get(entry.getKey());
            sortedByPrice.computeIfAbsent(price, k -> new ArrayList<>()).add(entry.getKey());
        }
        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            System.out.println("Price: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
