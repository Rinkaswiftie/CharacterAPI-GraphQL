package com.example.BasicCRUDOperations.models;

public class MagicalCreature implements Characters {

    String Id;
    String name;
    String foundIn;

    public MagicalCreature(String id, String name, String foundIn) {
        Id = id;
        this.name = name;
        this.foundIn = foundIn;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundIn() {
        return foundIn;
    }

    public void setFoundIn(String foundIn) {
        this.foundIn = foundIn;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
