package com.company;

public class Main {

    public static void main(String[] args) {
	// call method
        int area = computeAreaOfRectangle(10,15);
        System.out.println(area);
        int height=10;
        int widht=15;
        area=computeAreaOfRectangle(height,widht);
        System.out.println(area);
    }
    public static int computeAreaOfRectangle(int h, int w){
        return h*w;
    }
}
