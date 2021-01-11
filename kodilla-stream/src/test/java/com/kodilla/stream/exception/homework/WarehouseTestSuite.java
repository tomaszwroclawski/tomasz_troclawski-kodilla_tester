package com.kodilla.stream.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test (expected = OrderDoesntExistException.class)
    public  void testGetOrder_withException()throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();
        Order order = new Order("9");
        Order result = warehouse.getOrder(order.getNumber());
        assertEquals(order,result);
    }
@Test (expected = OrderDoesntExistException.class)
public  void testDoesOrderExist_withException()throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();
                Order order = new Order("3");
                warehouse.getOrder(order.getNumber());
}
}