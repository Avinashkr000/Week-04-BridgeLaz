package org.example.Day01.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketplaceTest {

    @Test
    void testMainMethodExecution() {
        ProductCatalog catalog = new ProductCatalog();
        Book book = new Book("Java Programing", 500.0, BookCategory.TECHNOLOGY);
        Clothing shirt = new Clothing("Casual Shirt", 300.0, ClothingCategory.MENS_WEAR);
        Gadget phone = new Gadget("Canoon D5600", 50000.0, GadgetCategory.CAMERA);

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        ProductCatalog.applyDiscount(book, 10);    // 10% on 500
        ProductCatalog.applyDiscount(shirt, 15);  // 15% on 300
        ProductCatalog.applyDiscount(phone, 5);   // 5% on 50000


        assertEquals(3, catalog.getProducts().size(), "The catalog should contain 3 products.");


        assertTrue(catalog.getProducts().stream().anyMatch(product ->
                product.getName().equals("Java Programing") &&
                        product.getPrice() == 450.0 &&
                        product.getCategory() == BookCategory.TECHNOLOGY
        ), "Java Programing book should exist with correct discounted price and category.");

        assertTrue(catalog.getProducts().stream().anyMatch(product ->
                product.getName().equals("Casual Shirt") &&
                        product.getPrice() == 255.0 &&
                        product.getCategory() == ClothingCategory.MENS_WEAR
        ), "Casual Shirt should exist with correct discounted price and category.");

        assertTrue(catalog.getProducts().stream().anyMatch(product ->
                product.getName().equals("Canoon D5600") &&
                        product.getPrice() == 47500.0 &&
                        product.getCategory() == GadgetCategory.CAMERA
        ), "Canoon D5600 should exist with correct discounted price and category.");
    }
}