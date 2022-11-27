package com.example.BasicCRUDOperations.models.Input;

import com.example.BasicCRUDOperations.models.HogwartsHouse;

public class CreateWizardInput {

    private String id;
    private String name;
    private HogwartsHouse house;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
}
