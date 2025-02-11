package com.gentech.Inheritance;

class Animal {
    String name;

    Animal() {
        System.out.println("An Animal is created");
    }
    Animal(String name) {
        this.name = name;
        System.out.println("An Animal named " + name + " is created.");
    }
}
class Mammal extends Animal {
    int age;
    Mammal() {
        super();
        System.out.println("A Mammal is created.");
    }
    Mammal(String name, int age) {
        super(name);
        this.age = age;
        System.out.println(name + " is a Mammal and is " + age + " years old.");
    }
}

class Dog extends Mammal {
    String breed;
    Dog() {
        super();
        System.out.println("A Dog is created.");
    }
    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println(name + " is a " + breed + " breed dog.");
    }
}
public class MultiLevelWithConstOverLoad {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println();
        Dog dog2 = new Dog("Buddy", 5, "Golden Retriever");
    }
}
