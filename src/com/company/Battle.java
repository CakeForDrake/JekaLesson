package com.company;

public class Battle {

    public boolean fight(Army attackerArmy, Army defenderArmy) {
        Warrior attacker = attackerArmy.getFrontUnit();
        Warrior defender = defenderArmy.getFrontUnit();
        while (attackerArmy.haveUnits() && defenderArmy.haveUnits()) {
            if (attacker.duel(defender)) {
                defenderArmy.removeUnit(defender);
                if (defenderArmy.getLegion().isEmpty()) {
                    return true;
                } else {
                    defender = defenderArmy.getFrontUnit();
                }
            } else {
                attackerArmy.removeUnit(attacker);
                if (attackerArmy.getLegion().isEmpty()) {
                    return false;
                } else {
                    attacker = attackerArmy.getFrontUnit();
                }
            }
        }
        return true;
    }
}
