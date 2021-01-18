package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order01 = new Order("ster", LocalDate.of(2020,1,12),3245.78);
    Order order02 = new Order("best", LocalDate.of(2020,4,11),458.78);
    Order order03 = new Order("ceramix", LocalDate.of(2018,12,1),8.50);
    Order order04 = new Order("deraz", LocalDate.of(2019,6,28),1879.25);
    Order order05 = new Order("mundi", LocalDate.of(2017,12,30),150.99);
    Order order06 = new Order("roler", LocalDate.of(2021,1,14),3500.00);


    @Test
    public void shouldAddOrdersToShop (){
        int numberOfOrders = shop.getOrderSize();
        assertEquals(6,numberOfOrders);
    }

    @Test
    public void shouldReturnEmptyListIfDataorderIsOutOfRange(){
        List<Order> emptyList = shop.getOrderFromDateToDate
                (LocalDate.of(2000,1,1),
                        LocalDate.of(2015,1,30));
        assertEquals(Collections.emptyList(),emptyList);
    }
    @Test
    public void shouldGetOrdersInValueRange(){
        List<Order> orders =shop.getOrderInValueRange(1,1000);
        assertEquals(3,orders.size());
    }
    @Test
    public void shouldReturnEmptyListWhenIsNotOrdersInValueRange(){
        List<Order> emptyList1 = shop.getOrderInValueRange(1,8);
        assertEquals(Collections.emptyList(),emptyList1);
    }
    @Test
    public void shouldGetOrdersValueTotal(){
        shop.getOrdersTotalValue();
        assertEquals(9243.3, shop.getOrdersTotalValue(),0.01);
    }
    @Test
    public void shouldGetExistingOrder(){
        Order result = shop.getOrder(3);
        assertEquals("deraz",result.getClientLoginName());
        assertEquals(1879.25,result.getOrderValue());
    }
    @Test
    public void getOrderWhichDoesNotExist(){
        Order order = shop.getOrder(7);
        assertEquals(0, order.getOrderValue());
        assertNull(order.getOrderDate());
        assertEquals("",order.getClientLoginName());
    }
    @BeforeEach
    public void initializeShop(){
        shop.addOrder(order01);
        shop.addOrder(order02);
        shop.addOrder(order03);
        shop.addOrder(order04);
        shop.addOrder(order05);
        shop.addOrder(order06);
    }
    @AfterEach
    public void resetAllValues(){
        System.out.println("Zerowanie ustawień testowych...");
    }
    @BeforeAll
    public static void displayIntroMessage(){
        System.out.println("Rozpoczęcie testowania:");

    }
    @AfterAll
    public static void displayGoodByeMessage(){
        System.out.println("Zakończenie testowania !!!!");
    }



}