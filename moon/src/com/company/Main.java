package com.company;

public class Main {

    public static void main(String[] args) {

        //conversion table of inches to meters
        //Display 12 feet of conversion, inch by inch., 12 feet is 144 inches.
        //Output a blank line every 12 inches (one meter equals approx 39.37 inches

        double meters, inches;
        int counter;
        counter = 0;
        String nea = "Nea är en tooti-pa-tooti";

        for(inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + " inches in. "+
                               meters + " meters.");
            counter++;

            if(counter == 12) {
                System.out.println();
                System.out.println(nea);
                counter = 0;

            }

        }


    }
}
