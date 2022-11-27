package com.example.BasicCRUDOperations.resolvers.query;


import com.example.BasicCRUDOperations.models.Wizard;
import com.example.BasicCRUDOperations.repositories.CharacterRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    CharacterRepository characterRepository;

    public Wizard wizard(String id) {
        return characterRepository.getCharacterByID(id);
    }

}
