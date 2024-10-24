package model;

import java.util.ArrayList;
import java.util.List;

public abstract class PackAnimal extends Animal {
    private List<String> commands;

    public PackAnimal(String name, String birthDate) {
        super(name, birthDate);
        this.commands = new ArrayList<>();
    }

    @Override
    public String getCommands() {
        return String.join(", ", commands);
    }

    @Override
    public void learnCommand(String command) {
        commands.add(command);
    }
}