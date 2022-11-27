package com.example.BasicCRUDOperations.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wizard implements Characters {

    private String id;
    private String name;
    private HogwartsHouse house;
    private List<Wizard> friends;

    public Wizard(String id, String name, HogwartsHouse house) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.friends = new ArrayList<Wizard>();;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HogwartsHouse getHouse() {
        return house;
    }

    public void setHouse(HogwartsHouse house) {
        this.house = house;
    }

    public List<Wizard> getFriends() {
        return friends;
    }

    public void setFriends(Wizard... friends) {
        this.friends = Arrays.asList(friends);
    }

    public void addFriend(Wizard c){
        this.friends.add(c);
    }
}
