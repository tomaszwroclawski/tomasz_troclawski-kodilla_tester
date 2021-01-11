package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrders(new Order("1"));
        warehouse.addOrders(new Order("2"));
        warehouse.addOrders(new Order("3"));
        warehouse.addOrders(new Order("4"));

        try{
            System.out.println(warehouse.getOrder("5").getNumber());
        }
        catch (OrderDoesntExistException e){
            System.out.println(" Sorry, but this number of order not exist in our Warehouse-system CNC");
        }
        finally {
            System.out.println("Thank you for using our Warehouse-system CNC");
        }

    }
}
