package org.example.Day02.Implementshoppingcart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    void testAddProduct() {
        shoppingCart.addProduct("Apple", 1.5);
        shoppingCart.addProduct("Banana", 0.8);
        Map<String, Double> expectedPrices = Map.of("Apple", 1.5, "Banana", 0.8);
        assertEquals(expectedPrices, shoppingCart.productPrices);
    }

    @Test
    void testAddItemToCart() {
        shoppingCart.addItemToCart("Apple", 4);
        shoppingCart.addItemToCart("Banana", 2);
        Map<String, Integer> expectedCart = Map.of("Apple", 4, "Banana", 2);
        assertEquals(expectedCart, shoppingCart.cartItems);
    }

    @Test
    void testDisplayCartItems() {
        shoppingCart.addItemToCart("Apple", 4);
        shoppingCart.addItemToCart("Banana", 2);
        // Mocked test to check output, in a real scenario you would capture console output or refactor code
        shoppingCart.displayCartItems();
    }

    @Test
    void testDisplayItemsSortedByPrice() {
        shoppingCart.addProduct("Apple", 1.5);
        shoppingCart.addProduct("Banana", 0.8);
        shoppingCart.addItemToCart("Apple", 4);
        shoppingCart.addItemToCart("Banana", 2);

        shoppingCart.displayItemsSortedByPrice();
    }
}