package com.kodilla.notification.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;


class WeatherAlertServiceTestSuite {
    //WeatherAlertService weatherAlertService =Mockito.mock(WeatherAlertService.class);
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    User user = Mockito.mock(User.class);
    User userB = Mockito.mock(User.class);
    User userC = Mockito.mock(User.class);
    User userD = Mockito.mock(User.class);
    User userE = Mockito.mock(User.class);

    Alert alert = Mockito.mock(Alert.class);

    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    Set<User> users = new HashSet<>();
    Set<Location> locations = new HashSet<>();
   // User user;
    //Location location;

    @BeforeAll
    public static void displayIntro() {
        System.out.println("Starting testing a Service of Weather");
    }

    @BeforeEach
    public void prepareDataUserAndLocation() {
        users.add(user);
        users.add(userB);
        users.add(userC);
        users.add(userD);
        users.add(userE);

        locations.add(location);
        locations.add(location2);

        for (Location location : locations) {

            weatherAlertService.addUser(user, location);
        }
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocationToHeIsSubscribed() {
        for (Location location : locations) {
            weatherAlertService.sendNotificationToLocation(alert, location);
        }
        Mockito.verify(user, Mockito.times(2)).receive(alert);
    }

    @Test
    public void subscriberShouldAbleRemoveSubscriptionToLocation() {
        weatherAlertService.removeUserFromLocation(user, location);
        for (Location location : locations) {
            weatherAlertService.sendNotificationToLocation(alert, location);
        }
        Mockito.verify(userD, Mockito.times(0)).receive(alert);
    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {
        weatherAlertService.addUser(user, location);
        weatherAlertService.addUser(userB, location2);
        weatherAlertService.addUser(userC, location2);
        weatherAlertService.addUser(userD, location);
        weatherAlertService.addUser(userE, location);

        weatherAlertService.sendNotificationToAll(alert);

        for (User user : this.users) {
            Mockito.verify(user, Mockito.times(1)).receive(alert);
        }

    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {
        for (User user : users) {
            weatherAlertService.addUser(user, location);
        }

        weatherAlertService.removeLocation(location);

        for (User user : this.users) {
            Mockito.verify(user, Mockito.never()).receive(alert);
        }
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        weatherAlertService.removeAllUsers(user);
        for (Location location : locations) {
            weatherAlertService.sendNotificationToLocation(alert, location);
        }

        Mockito.verify(userB, Mockito.never()).receive(null);
    }

    @AfterAll
    public static void displayGoodByeInfo() {
        System.out.println("Test is finish - Check result.");
    }


}