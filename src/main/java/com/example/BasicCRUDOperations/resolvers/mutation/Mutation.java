package com.example.BasicCRUDOperations.resolvers.mutation;


import com.example.BasicCRUDOperations.models.Input.CreateWizardInput;
import com.example.BasicCRUDOperations.models.Wizard;
import com.example.BasicCRUDOperations.repositories.CharacterRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    final CharacterRepository characterRepository;

    @Autowired
    public Mutation(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    Wizard createWizard(@NotNull CreateWizardInput w){
        Wizard newWizard = new Wizard(w.getId(),w.getName(),w.getHouse());
        characterRepository.addCharacter(newWizard);
        return newWizard;
    }

    Wizard addFriendsToWizard(String wizardId, String friendId){
        //todo: needs null handling or match not found handling
        Wizard WizardToUpdate = characterRepository.getCharacterByID(wizardId);
        Wizard friend = characterRepository.getCharacterByID(friendId);
        WizardToUpdate.addFriend(friend);
        characterRepository.addCharacter(WizardToUpdate);
        return WizardToUpdate;
    }

    Wizard deleteWizard(String wizardId){
        Wizard deletedWizard = characterRepository.getCharacterByID(wizardId);
        characterRepository.removeCharacter(wizardId);
        return deletedWizard;
    }

}
