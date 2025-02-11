package com.gentech.Inheritance;
class Animals {
    String name;
    void displayName()
    {
        System.out.println("Animal Name: " + name);
    }
}

class Mammals extends Animals {
    String name;
    Mammals(String animalName) {
        //super(animalName);
        super.name=animalName;
        super.displayName();
    }
    void displayName()
    {
        System.out.println("Mammal Name: " + name);
    }
}
class Dogs extends Mammals {
    String name;
    Dogs(String animalName, String mammalName, String dogName) {
        super(animalName);
        super.name=mammalName;
        super.displayName();
        this.name = dogName;
    }
    void displayName() {
        System.out.println("Dog Name: " + name);
    }
}



public class Multileveachclasscontainssamevarnamewithdatatype {
    public static void main(String[] args) {
        Dogs dog = new Dogs("Generic Animal", "Lion", "Buddy");
        dog.displayName();

    }
}
