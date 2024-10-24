package model;

public class Cat extends Pet {
    public Cat(String name, String birthDate) {
        super(name, birthDate);
        this.learnCommand("Climb");
        this.learnCommand("Jump");
    }


    @Override
    public void learnCommand(String command) {
        super.learnCommand(command);
        System.out.println("Cat learned: " + command);
    }
}
