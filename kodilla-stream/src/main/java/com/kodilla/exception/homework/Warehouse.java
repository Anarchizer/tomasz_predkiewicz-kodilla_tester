package com.kodilla.exception.homework;

import java.util.*;
import java.util.stream.Stream;
import static java.util.spi.ToolProvider.findFirst;

public class Warehouse {
    public static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
    }
}