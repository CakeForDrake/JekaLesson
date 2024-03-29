package com.company;

import java.util.ArrayList;

public class Army {
    private String race;
    private ArrayList<Warrior> legion;

    public Army() {
        this.race = "unknown";
        this.legion = new ArrayList<>();
    }

    public Army(String race, int units) {
        this.race = race;
        this.legion = new ArrayList<>();
        for (int i = 0; i < units; i++) {
            legion.add(new Warrior());
        }
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getUnits() {
        return legion.size();
    }

    public ArrayList<Warrior> getLegion() {
        return legion;
    }

    public void addUnit(Warrior unit) {
        legion.add(unit);
    }

    public void addUnits(int warriors,int knights,int defenders) {
        for (int i = 0; i < warriors; i++) {
            legion.add(new Warrior());
        }
        for (int i = 0; i < knights; i++) {
            legion.add(new Knight());
        }
        for (int i = 0; i < defenders; i++) {
            legion.add(new Defender());
        }
    }

    public void addDefenders(int x) {
        for (int i = 0; i < x; i++) {
            legion.add(new Defender());
        }
    }

    public void addWarriors(int x) {
        for (int i = 0; i < x; i++) {
            legion.add(new Warrior());
        }
    }

    public void removeUnit(Warrior unit) {
        legion.remove(unit);
    }


    public void addKnights(int x) {
        for (int i = 0; i < x; i++) {
            legion.add(new Knight());
        }
    }

}



