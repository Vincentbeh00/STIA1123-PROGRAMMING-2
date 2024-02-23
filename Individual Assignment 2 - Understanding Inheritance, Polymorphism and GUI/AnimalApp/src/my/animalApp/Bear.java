package my.animalApp;

public class Bear extends Animal implements Carnivore, Herbivore {
    private String sound;
    private String colour;
    
  
     public Bear(String name, int numOfLegs, String sound, String colour) {
        super(name, numOfLegs);
        this.sound = sound;
        this.colour = colour;
    }

         public String display() {
        return "Name: " + getName() + "\nNumber of legs: " + getNumOfLegs() + "\nSound: " + sound + "\nColour: " + colour;
    }

    public String typeC() {
        return "Carnivore";
    }

    public String foodC() {
        return "Meat/Animal Sources Eater";
    }
    // implement methods from Herbivore interface
    public String typeH() {
         return "Herbivore";
    }


    public String foodH() {
        return "Plants";
    }
    
       public String typeO() {
         return "Omnivore";
    }


    public String foodO() {
        return "Plants and are also Meat/Animal Source Eater";
    }
    
    public String descO() {
        return "Omnivore is similar to both Herbivore and Carnivore";
    }
    

    @Override
    public String eat() {
        return "Bear like to eat berries, roots, fungi, grasses, fish, carrion, small mammals, and insects. ";
    }

}
