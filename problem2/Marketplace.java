package org.example.Day01.problem2;


public class Marketplace {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Book book = new Book("Java Programing", 500.0, BookCategory.TECHNOLOGY);
        Clothing shirt = new Clothing("Casual Shirt", 300.0, ClothingCategory.MENS_WEAR);
        Gadget phone = new Gadget("Canoon D5600", 50000.0, GadgetCategory.CAMERA);

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        ProductCatalog.applyDiscount(book, 10);
        ProductCatalog.applyDiscount(shirt, 15);
        ProductCatalog.applyDiscount(phone, 5);

        catalog.getProducts().forEach(product ->
                System.out.println("Name: " + product.getName()
                                    + ", Price: " + product.getPrice()
                                     + ", Category: " + product.getCategory()));
    }
}