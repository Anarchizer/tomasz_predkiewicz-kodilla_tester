package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.Map;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("11"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("41"));
        warehouse.addOrder(new Order("13"));

        try{
            warehouse.getOrder("3");
            System.out.println(warehouse.getOrder("2"));
        } catch (OrderDoesntExistException e){
            System.out.println("No such order");
        } finally{
            System.out.println("Thank you for using our warehouse");
        }
    }
}
