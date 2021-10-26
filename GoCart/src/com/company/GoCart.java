package com.company;

public class GoCart {
    public static final int MAX_BARS = 8;
    private String color;
    private int barCount;
    private int lapsDriven;

    public GoCart(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void charge() {
        barCount = MAX_BARS;
    }

    public boolean isBatteryEmpty() {
        return barCount == 0;
    }

    public boolean isFullyCharged() {
        return MAX_BARS == barCount;
    }

    public void drive(int laps) {
        lapsDriven+= laps;
        barCount-= laps;
    }

    public void drive(){
        drive(1);
    }
}
