package org.example.Day01.problem1;

abstract class WarehouseItem {
    private String name;
    private int id;

    public WarehouseItem(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public int getId() {

        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}


