package view.animalConsoleView;

import model.Animal;
import presenter.AnimalPresenter;
import view.interfaces.AnimalView;

import java.util.List;
import java.util.Scanner;

public class AnimalConsoleView implements AnimalView {
    private AnimalPresenter presenter;

    public AnimalConsoleView(AnimalPresenter presenter) {
        this.presenter = presenter;
    }

    public void setPresenter(AnimalPresenter presenter) {
        this.presenter = presenter;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Завести новое животное");
            System.out.println("2. Показать всех животных");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Выход");
            System.out.print("Выберите опцию: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    addAnimal(scanner);
                    break;
                case 2:
                    presenter.showAllAnimals();
                    break;
                case 3:
                    trainAnimal(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректная опция. Попробуйте снова.");
            }
        }
    }

    private void addAnimal(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите дату рождения (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        System.out.print("Введите тип (Собака/Кошка/Хомяк/Лошадь/Осел): ");
        String type = scanner.nextLine();

        presenter.addAnimal(name, birthDate, type);
    }

    private void trainAnimal(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите команду для обучения: ");
        String command = scanner.nextLine();

        presenter.trainAnimal(name, command);
    }

    @Override
    public void showAnimalAdded(String name) {
        System.out.println("Животное добавлено: " + name);
    }

    @Override
    public void displayAnimals(List<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println("Нет зарегистрированных животных.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName() + ") - Команды: " + animal.getCommands());
            }
        }
    }
}
