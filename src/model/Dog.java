package model;

public class Dog extends Pet {
    public Dog(String name, String birthDate) {
        super(name, birthDate);
        this.learnCommand("Sit");
        this.learnCommand("Stay");
        this.learnCommand("Fetch");
    }


    @Override
    public void learnCommand(String command) {
        super.learnCommand(command);
        System.out.println("Dog learned: " + command);
    }
}
