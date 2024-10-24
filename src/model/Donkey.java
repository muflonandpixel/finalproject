package model;

public class Donkey extends PackAnimal {
    public Donkey(String name, String birthDate) {
        super(name, birthDate);
        this.learnCommand("Carry load");
    }


    @Override
    public void learnCommand(String command) {
        super.learnCommand(command);
        System.out.println("Donkey learned: " + command);
    }
}
