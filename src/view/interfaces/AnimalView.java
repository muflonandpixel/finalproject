package view.interfaces;

import model.Animal;
import java.util.List;

public interface AnimalView {
    void showAnimalAdded(String name);

    void displayAnimals(List<Animal> animals);
}
