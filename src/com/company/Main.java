package com.company;

public class Main {

    public static void main(String[] args) {
     Dog dog = new Dog();
        System.out.println(dog.toString());
    }
}

class Animal {
    String sound = "";
    String action = "";

    void makeSound() {
        System.out.println(sound);
    }
    void action() {
        System.out.println(action);
    }

}

class Dog extends Animal {
    Dog() {
        sound = "barks";
    }
}

class DogFood {}