package com.kodilla.stream.optional.homework;

import com.kodilla.exception.homework.Order;
import com.kodilla.exception.homework.OrderDoesntExistException;
import com.kodilla.exception.homework.Warehouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseAppTest {
    @Test
    public void shouldThrowOrderDoesntExistExceptionForNonexistentOrder() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("999"));
    }

    @Test
    public void shouldNotThrowOrderDoesntExistExceptionForExistingOrder() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));

        assertDoesNotThrow(() -> warehouse.getOrder("456"));
    }
}
