package com.company;

import java.util.ArrayList;

public class Army {
    private String race = "Unknown";
    private ArrayList<Warrior> legion = new ArrayList<>();;

    public Army() {}

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

    public Warrior getFrontUnit() {
        return legion.get(0);
    }

    public boolean haveUnits() {
        return !legion.isEmpty();
    }

    public void removeUnit(Warrior unit) {
        legion.remove(unit);
    }

    public void addUnit(Warrior unit) {
        legion.add(unit);
    }

    public void addUnit(int number, WarriorType warriorType) {
        for (int i = 0; i < number; i++) {
            switch (warriorType) {
                case KNIGHT -> legion.add(new Knight());
                case WARRIOR -> legion.add(new Warrior());
                case DEFENDER -> legion.add(new Defender());
            }
        }
    }
}



