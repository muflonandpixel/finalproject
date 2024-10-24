

import presenter.AnimalPresenter;
import view.animalConsoleView.AnimalConsoleView;

public class AnimalRegistryApp {
    public static void main(String[] args) {
        // Создаём объект view и передаём его в презентер
        AnimalConsoleView view = new AnimalConsoleView(null);  // Инициализируем view
        AnimalPresenter presenter = new AnimalPresenter(view);  // Передаем view в presenter
        view.setPresenter(presenter);  // Устанавливаем presenter для view
        view.start();  // Запуск программы
    }
}
