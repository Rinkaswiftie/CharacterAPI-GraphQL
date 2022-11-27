package com.example.BasicCRUDOperations.repositories;


import com.example.BasicCRUDOperations.models.HogwartsHouse;
import com.example.BasicCRUDOperations.models.Wizard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CharacterRepository {

    HashMap<String, Wizard> characterMap = new HashMap<>();

    public CharacterRepository() {
        Wizard harry = new Wizard("001", "Harry Potter", HogwartsHouse.GRYFFINDOR);
        Wizard ron = new Wizard("002", "Ronald Weasley", HogwartsHouse.GRYFFINDOR);
        Wizard hermione = new Wizard("003", "Hermione Granger", HogwartsHouse.GRYFFINDOR);
        Wizard cho = new Wizard("004", "Cho Chang", HogwartsHouse.RAVENCLAW);
        Wizard malfoy = new Wizard("005", "Draco Malfoy", HogwartsHouse.SLYTHERIN);
        Wizard cedric = new Wizard("006", "Cedric Diggory", HogwartsHouse.RAVENCLAW);
        Wizard crabbe = new Wizard("007", "Vincent Crabbe", HogwartsHouse.SLYTHERIN);

        harry.setFriends(ron,hermione);
        ron.setFriends(harry,hermione);
        hermione.setFriends(ron,harry);
        cho.setFriends(cedric);
        cedric.setFriends(cho);
        crabbe.setFriends(malfoy);
        malfoy.setFriends(crabbe);

        characterMap.put(harry.getId(), harry);
        characterMap.put(ron.getId(), ron);
        characterMap.put(hermione.getId(), hermione);
        characterMap.put(cho.getId(), cho);
        characterMap.put(malfoy.getId(), malfoy);
        characterMap.put(cedric.getId(), cedric);
        characterMap.put(crabbe.getId(), crabbe);
    }

    public ArrayList<Wizard> getCharacters() {
        return new ArrayList<Wizard>(characterMap.values());
    }

    public Wizard getCharacterByID(String id) {
        return characterMap.get(id);
    }

    public Wizard addCharacter(Wizard c) {
        return characterMap.put(c.getId(),c);
    }

    public Wizard removeCharacter(String id) {
        return characterMap.remove(id);
    }

    public Wizard updateCharacter(Wizard c) {
        return characterMap.put(c.getId(),c);
    }

}
