package com.company;

public class Animal {

    private int legs = 4;

    public String goHunt() {
        return "I'm hunting now!";
    }

    protected int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
