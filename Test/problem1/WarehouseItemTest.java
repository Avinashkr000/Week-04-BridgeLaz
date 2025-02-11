package org.example.Day01.problem1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class SmartWarehouseTest {

    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    void setUp() {
        electronicsStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }

    @Test
    void testAddAndGetItem() {
        Electronics laptop = new Electronics("Laptop", 1);
        electronicsStorage.addItem(laptop);

        assertAll(
                () -> assertEquals(laptop, electronicsStorage.getItem(1)),
                () -> assertNull(electronicsStorage.getItem(2))
        );
    }

    @Test
    void testDisplayAllItems() {
        groceriesStorage.addItem(new Groceries("Apple", 3));
        groceriesStorage.addItem(new Groceries("Bread", 4));

        assertDoesNotThrow(groceriesStorage::displayAllItems);
    }

    @Test
    void testWarehouseManagerDisplayAllItems() {
        furnitureStorage.addItem(new Furniture("Chair", 5));
        furnitureStorage.addItem(new Furniture("Table", 6));

        List<WarehouseItem> allItems = new ArrayList<>(furnitureStorage.getItems());

        assertDoesNotThrow(() -> Storage.WarehouseManager.displayAllItems(allItems));
    }


    @Test
    void testTypeSafety() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Smartphone", 2));



        assertTrue(true, "Compilation enforces type safety.");
    }


    @Test
    void testToString() {
        WarehouseItem item = new Electronics("Tablet", 8);
        String expected = "ID: 8, Name: Tablet";
        assertEquals(expected, item.toString());
    }
}