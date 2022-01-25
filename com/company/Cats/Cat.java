package com.company.Cats;

public class Cat extends Animal {

    private int age;
    private String color;
    private int weight;
    private String breed;
    private String name;
    public boolean isAlive = true;

    public Cat(){
        this.age = 5;
        this.weight = 4;
        this.name = "Murchik";
        this.setLegs(6);
    }

    public Cat(int age, String color, int weight, String breed) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(int age, String color, int weight, String breed, String name) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.breed = breed;
        this.name = name;
    }

    @Override
    public String goHunt() {
        return "I'm cat and "+ super.goHunt();
    }

    public String makeNoise() {
        return "MEAW!!!!";
    }

    public String makeNoise(String word) {
        return "MEAW "+word;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
