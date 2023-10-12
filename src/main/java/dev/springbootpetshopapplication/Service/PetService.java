package dev.springbootpetshopapplication.Service;

import dev.springbootpetshopapplication.Models.Pet;

import java.util.List;

public interface PetService {

    List<Pet> getAllPets();
    List<Pet> getPetByBreed();
    Pet createPet(Pet pet);
}
