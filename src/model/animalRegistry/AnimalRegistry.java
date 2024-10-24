package model.animalRegistry;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;

    public AnimalRegistry() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
