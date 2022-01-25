package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("We are chillin");
        System.out.println(PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Vader", "red");
        System.out.printf("The dispenser is %s and the color is %s %n",
                dispenser.getCharacterName(),
                dispenser.getCharacterColor());

        if (dispenser.isEmpty()){
            System.out.println("Dispenser is empty");
        }

        System.out.println("filling the dispenser with delicious pez...");
        dispenser.fill();
        if (!dispenser.isEmpty()){
            System.out.printf("dispenser is full with %s",
                    dispenser.getPezCount());
        }

        while (dispenser.dispense()){
            System.out.println("Chomp" + dispenser.getPezCount());
        }
        if (dispenser.isEmpty()){
            System.out.println("ate all the PEZ");
        }
        dispenser.fill(5);
        dispenser.fill(3);
        while (dispenser.dispense()){
            System.out.println("Chimp!!");
        }
    }
}
