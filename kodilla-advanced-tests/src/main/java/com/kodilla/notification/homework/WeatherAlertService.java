package com.kodilla.notification.homework;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Set;

public class WeatherAlertService {
    private final HashMap<User, Set<Location>> userInLocation = new HashMap<>();

    public void addUser (User user, Location location ){
        userInLocation.computeIfAbsent(user, k->new HashSet<>()).add(location);
    }
    public void sendNotificationToLocation(Alert alert,Location location) {
        userInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getKey().receive(alert));

    }
    public void sendNotificationToAll(Alert alert){
        userInLocation.entrySet()
                .stream()
                .forEach(entry -> entry.getKey().receive(alert));
    }
    public void removeUserFromLocation (User user,Location location){
        this.userInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(user))
                .forEach(entry -> entry.getValue().remove(location));

    }
   public void removeLocation (Location location){
     this.userInLocation.entrySet()
            .stream()
            .filter(entry -> entry.getValue().contains(location))
             .forEach(entry ->entry.getValue().remove(location));
    }
    public void removeAllUsers (User user){
        this.userInLocation.entrySet()
                .removeIf(entry ->(userInLocation.equals(entry.getKey())));
    }

}
