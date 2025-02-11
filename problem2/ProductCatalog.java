package org.example.Day01.problem2;


import java.util.ArrayList;
import java.util.List;

class ProductCatalog {
    private final List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public List<Product<?>> getProducts() {
        return products;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(newPrice);
    }
}