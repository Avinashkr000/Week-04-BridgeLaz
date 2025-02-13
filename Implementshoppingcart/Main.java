package org.example.Day02.Implementshoppingcart;


public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 50);
        cart.addProduct("Banana", 30);
        cart.addProduct("Orange", 25);

        cart.addItemToCart("Apple", 3);
        cart.addItemToCart("Banana", 12);
        cart.addItemToCart("Orange", 5);

        System.out.println("Cart Items in Cart:");
        cart.displayCartItems();

        System.out.println("\nItems by Price:");
        cart.displayItemsSortedByPrice();
    }
}

