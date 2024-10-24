package model;

public class Hamster extends Pet {
    public Hamster(String name, String birthDate) {
        super(name, birthDate);
        this.learnCommand("Run in wheel");
    }


    @Override
    public void learnCommand(String command) {
        super.learnCommand(command);
        System.out.println("Hamster learned: " + command);
    }
}
