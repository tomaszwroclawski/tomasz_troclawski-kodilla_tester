package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders;
    public Warehouse(){
        this.orders = new ArrayList<>();
    }
    public  void addOrders (Order order){
        orders.add(order);
    }
    public Order getOrder (String number) throws  OrderDoesntExistException{
        Order order = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst().orElseThrow(()-> new OrderDoesntExistException());
        return  order;
    }
}
