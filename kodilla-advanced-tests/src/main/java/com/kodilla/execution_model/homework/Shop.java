package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();
//  dodanie zamówienia do listy
    public void addOrder (Order order){
        this.orders.add(order);
    }
//  zwrócenie listy zamówień z zakresu dwóch dat

    public List<Order> getOrderFromDateToDate(LocalDate from, LocalDate to){
        return orders.stream()
                .filter(d -> d.getOrderDate().isAfter(from)&& d.getOrderDate().isBefore(to))
                .collect(Collectors.toList());
    }
//  pobranie zamówienia najmniejsza i największa wartość - na podstawie przekazanego zakresu dat

    public List<Order> getOrderInValueRange(double lowValue, double highValue ){
        return orders.stream()
                .filter(v-> v.getOrderValue() >= lowValue && v.getOrderValue()<= highValue)
                .collect(Collectors.toList());
    }
//  zwrot liczby zamówień

    public int getOrderSize(){

        return orders.size();
    }

//  suma wszystkich zamówień

    public double  getOrdersTotalValue(){
        return orders.stream()
                .map(t -> t.getOrderValue())
                .mapToDouble(t ->t)
                .sum();
    }
// zwrócenie zamówienia
    public Order getOrder (int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return new Order("",null,0);
    }


}
