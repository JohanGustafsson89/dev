package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.action();
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
        sound = "bark";
        action = "jump";

    }
}