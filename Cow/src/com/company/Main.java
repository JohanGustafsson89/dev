package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
    Cow2 cow = new Cow2("Larry");
        System.out.println(cow.getName());
        System.out.println(cow.myMethod());
    }

    public static void test(){
        Cow cow = new Cow();
        Collection.sort(cow)
    }

}
