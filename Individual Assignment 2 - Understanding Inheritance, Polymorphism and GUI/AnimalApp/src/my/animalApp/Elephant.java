package my.animalApp;

public class Elephant extends Animal implements Herbivore {
     private String sound;
    private String colour;

    public Elephant(String name, int numOfLegs, String sound, String colour) {
        super(name, numOfLegs);
        this.sound = sound;
        this.colour = colour;
    }

    // implement abstract methods from Animal
    public String display() {
        return "Name: " + getName() + "\nNumber of legs: " + getNumOfLegs() + "\nSound: " + sound + "\nColour: " + colour;
    }

    // implement methods from Herbivore interface
    public String typeH() {
         return "Herbivore";
    }


    public String foodH() {
        return "eats Plants";
    }

    @Override
    public String eat() {
        return "Elephants like to eat grasses, small plants, bushes, fruit, twigs, tree bark, and roots.";
    }
}
