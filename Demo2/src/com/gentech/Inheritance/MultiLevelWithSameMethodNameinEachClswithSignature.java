package com.gentech.Inheritance;

class AAnimal {
    void sound()
    {
        System.out.println("Animals make different sounds.");
    }
}
class MMammal extends AAnimal {
    MMammal()
    {
        super.sound();
    }
    @Override
    void sound()
    {
        System.out.println("Mammals make specific sounds.");
    }
}
class Cat extends MMammal {
    Cat()
    {
        super.sound();
    }
    @Override
    void sound() {
        System.out.println("Cats mew mew");
    }
}


public class MultiLevelWithSameMethodNameinEachClswithSignature {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

    }
}
