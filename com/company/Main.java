package com.company;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat(10,"yellow", 30, "pizduk'");
        System.out.println(cat.makeNoise());

        System.out.println(cat.makeNoise("MOTHERFUCKER!"));

        Cat cat2 = new Cat();

        System.out.println(cat2.makeNoise()+"<---- "+cat2.getName());
        cat2.setName("Fury");
        System.out.println(cat2.makeNoise()+"<---- "+cat2.getName());
        System.out.println(cat2.getLegs());
        System.out.println(cat2.goHunt());

    }
}
