package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));
        warehouse.addOrder(new Order("789"));

        try {
            Order foundOrder = warehouse.getOrder("456");
            System.out.println("Found order with number: " + foundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.err.println(e.getMessage());
        }

        try {
            Order notFoundOrder = warehouse.getOrder("999");
            System.out.println("Found order with number: " + notFoundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.err.println(e.getMessage());
        }
    }
}
