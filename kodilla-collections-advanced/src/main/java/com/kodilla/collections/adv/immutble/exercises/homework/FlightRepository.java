package com.kodilla.collections.adv.immutble.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    static List<Flight> getFlightsTable(){
        List<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("Gdańsk","Tel Aviv"));
        flightsList.add(new Flight("Warszawa","Gdańsk"));
        flightsList.add(new Flight("Lublin","Tel Aviv"));
        flightsList.add(new Flight("London", "Warszawa"));

        return flightsList;
    }
}
