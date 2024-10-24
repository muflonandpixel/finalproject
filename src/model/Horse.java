package model;

public class Horse extends PackAnimal {
    public Horse(String name, String birthDate) {
        super(name, birthDate);
        this.learnCommand("Trot");
        this.learnCommand("Gallop");
    }


    @Override
    public void learnCommand(String command) {
        super.learnCommand(command);
        System.out.println("Horse learned: " + command);
    }
}
