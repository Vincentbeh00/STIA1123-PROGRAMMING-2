package my.animalApp;

public class Cat extends Animal implements Pet,Carnivore {
    private String sound;
    private String colour;
    
    public Cat(String name, int numOfLegs, String sound, String colour) {
        super(name, numOfLegs);
        this.sound = sound;
        this.colour = colour;
    }

        // implement abstract methods from Animal
    public String display() {
        return "Name: " + getName() + "\nNumber of legs: " + getNumOfLegs() + "\nSound: " + sound + "\nColour: " + colour;
    }

        // implement methods from Carnivore interface
    public String typeC() {
        return "Carnivore";
    }

    public String foodC() {
        return "Meat/Animal Source Eater";
    }
    
    @Override
    public String play(){
    return getName() + " likes to play with strings and cat toys.";
    }
    
    @Override
    public String eat(){
    return  "Cat likes to eat birds, mice, fish etc. ";
    }

  
    
}
