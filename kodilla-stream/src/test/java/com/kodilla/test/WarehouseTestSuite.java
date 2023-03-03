package com.kodilla.test;

import com.kodilla.exception.homework.Order;
import com.kodilla.exception.homework.OrderDoesntExistException;
import com.kodilla.exception.homework.Warehouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseTestSuite {
    @Test
    public void isWarehouseGettingOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));

        assertEquals(warehouse.getOrder("1").getNumber(), "1");
    }

    @Test
    public void isWarehouseGettingOrder_withException(){
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("4"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("3"));
    }
}
