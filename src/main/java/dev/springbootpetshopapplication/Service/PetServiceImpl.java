package dev.springbootpetshopapplication.Service;

import dev.springbootpetshopapplication.Models.Pet;
import dev.springbootpetshopapplication.Repository.PetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService{

    @Autowired
    private PetDao petDao;

    @Override
    public List<Pet> getAllPets() {
        return petDao.findAll();
    }

    @Override
    public Pet createPet(Pet pet) {
        return petDao.save(pet);
    }

    @Override
    public List<Pet> getPetByBreed() {
        return petDao.findAll();
    }
}
