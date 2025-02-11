package org.example.Day01.problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1));
        electronicsStorage.addItem(new Electronics("Smartphone", 2));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Bread", 3));
        groceriesStorage.addItem(new Groceries("Milk", 4));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 5));
        furnitureStorage.addItem(new Furniture("Table", 6));

        electronicsStorage.displayAllItems();
        groceriesStorage.displayAllItems();
        furnitureStorage.displayAllItems();

        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getItems());
        allItems.addAll(groceriesStorage.getItems());
        allItems.addAll(furnitureStorage.getItems());

        Storage.WarehouseManager.displayAllItems(allItems);
    }
}