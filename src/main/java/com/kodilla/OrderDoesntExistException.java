package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException() {
        super("Order doesn't exist.");
    }

    public OrderDoesntExistException(String message) {
        super(message);
    }
}
