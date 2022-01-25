package com.company;

public class Main {

    public static void main(String[] args) {
        GoCart goCart = new GoCart("Red");
        System.out.println(goCart);
        System.out.println(goCart.isFullyCharged());
        goCart.charge();
        while (!goCart.isBatteryEmpty()){
            goCart.drive();
            System.out.println("Wee we are driving");
        }
    }
}