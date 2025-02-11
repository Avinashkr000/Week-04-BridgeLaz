package org.example.Day01.problem1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void displayAllItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public Collection<? extends WarehouseItem> getItems() {
        return items;
    }


    static class WarehouseManager {
        public static void displayAllItems(List<? extends WarehouseItem> items) {
            for (WarehouseItem item : items) {
                System.out.println(item);
            }
        }
    }
}