package com.company;

public class Main {

    public static void main(String[] args) {
        Army gouls = new Army("Undead", 10);
        Army paladins = new Army();
        paladins.setRace("Human");
        paladins.addUnit(4, WarriorType.KNIGHT);
        paladins.addUnit(4, WarriorType.WARRIOR);
        paladins.addUnit(2, WarriorType.DEFENDER);
        Battle holyWar = new Battle();
        System.out.println(holyWar.fight(paladins,gouls));
    }
}

