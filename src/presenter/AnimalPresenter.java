package presenter;

import model.Animal;
import model.animalRegistry.AnimalRegistry;
import model.counter.Counter;
import model.Dog;
import model.Cat;
import model.Hamster;
import model.Horse;
import model.Donkey;
import view.interfaces.AnimalView;

public class AnimalPresenter {
    private AnimalRegistry registry;
    private AnimalView view;

    public AnimalPresenter(AnimalView view) {
        this.view = view;
        this.registry = new AnimalRegistry();
    }

    public void addAnimal(String name, String birthDate, String type) {
        try (Counter counter = new Counter()) {
            Animal animal = null;

            switch (type.toLowerCase()) {
                case "собака":
                    animal = new Dog(name, birthDate);
                    break;
                case "кошка":
                    animal = new Cat(name, birthDate);
                    break;
                case "хомяк":
                    animal = new Hamster(name, birthDate);
                    break;
                case "лошадь":
                    animal = new Horse(name, birthDate);
                    break;
                case "осел":
                    animal = new Donkey(name, birthDate);
                    break;
                default:
                    System.out.println("Некорректный тип животного.");
                    return;
            }

            registry.addAnimal(animal);
            counter.add();
            view.showAnimalAdded(animal.getName());
        } catch (Exception e) {
            System.out.println("Ошибка при использовании счетчика: " + e.getMessage());
        }
    }

    public void showAllAnimals() {
        view.displayAnimals(registry.getAnimals());
    }

    public void trainAnimal(String name, String command) {
        for (Animal animal : registry.getAnimals()) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.learnCommand(command);
                System.out.println(name + " обучен команде: " + command);
                return;
            }
        }
        System.out.println("Животное с именем " + name + " не найдено.");
    }
}
