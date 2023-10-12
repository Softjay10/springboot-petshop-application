package dev.springbootpetshopapplication.Controller;

import dev.springbootpetshopapplication.Models.Pet;
import dev.springbootpetshopapplication.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pets")
    public List<Pet> getAllPets(@RequestParam(name = "breed", required = false) String breeds) {
        if (breeds != null && breeds.length() > 0) {
            return petService.getPetByBreed();
        }
        return petService.getAllPets();
    }

    @PostMapping(value = "/pets")
    public ResponseEntity<Pet> savePet(@RequestBody Pet pet){
        Pet savedPet = petService.createPet(pet);
        return ResponseEntity.ok(savedPet);
    }
}
