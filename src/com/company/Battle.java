package com.company;

public class Battle {

    public boolean fight(Army atk, Army target) {
        boolean victory = true;

        while (!atk.getLegion().isEmpty() && !target.getLegion().isEmpty()) {

            int thisDmg = atk.getLegion().get(0).getDmg() - target.getLegion().get(0).getArmor();
            if (thisDmg < 0) {
                thisDmg = 0;
            }
            int targetDmg = target.getLegion().get(0).getDmg() - atk.getLegion().get(0).getArmor();
            if (targetDmg < 0) {
                targetDmg = 0;
            }
            int thisHp = atk.getLegion().get(0).getHp();
            int targetHp = target.getLegion().get(0).getHp();
            System.out.println(atk.getRace() + " soldier " + thisHp);
            System.out.println(target.getRace() + " soldier " + targetHp);

            if (thisHp > 0) {
                target.getLegion().get(0).setHp(targetHp - thisDmg);
            }
            if (targetHp > 0) {
                atk.getLegion().get(0).setHp(thisHp - targetDmg);
            } else {
                System.out.println(target.getRace() + " soldier was killed!");
                target.getLegion().remove(0);
                System.out.println(atk.getUnits() + " " + atk.getRace() + " soldiers remaining! \n" + target.getUnits() + " " + target.getRace() + " soldiers remaining! \n");
            }
            if (thisHp <= 0) {
                System.out.println(atk.getRace() + " soldier was killed!");
                atk.getLegion().remove(0);
                System.out.println(atk.getUnits() + " " + atk.getRace() + " soldiers remaining! \n" + target.getUnits() + " " + target.getRace() + " soldiers remaining! \n");
            }
            if (target.getLegion().isEmpty()) {
                System.out.println(atk.getRace() + " army has won the battle with " + atk.getUnits() + " unit(s) remaining (" + atk.getLegion().get(0).getHp() + " HP)");
                break;
            }
            if (atk.getLegion().isEmpty()) {
                victory = false;
                System.out.println(target.getRace() + " army has won the battle with " + target.getUnits() + " unit(s) remaining (" + target.getLegion().get(0).getHp() + "HP)");
                break;
            }
        }
        return victory;
    }

    public boolean realFight(Army attack, Army defend) {
        boolean victory = true;

        while (!attack.getLegion().isEmpty() && !defend.getLegion().isEmpty()) {
            Warrior attacker = attack.getLegion().get(0);
            Warrior defender = defend.getLegion().get(0);
            if (attacker.duel(defender)) {
                defend.removeUnit(defender);
                System.out.println(attack.getRace() + " " + attack.getUnits() + " units remaining!\n" + defend.getRace() + " " + defend.getUnits() + " units remaining!\n\n");
            } else {
                attack.removeUnit(attacker);
                System.out.println(attack.getRace() + " " + attack.getUnits() + " units remaining!\n" + defend.getRace() + " " + defend.getUnits() + " units remaining!\n\n");
            }
            if (attack.getLegion().isEmpty()) {
                victory = false;
                System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \n " + attack.getRace() + " legion has lost the battle! \n !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            } else {
                if (defend.getLegion().isEmpty()) {
                    System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \n " + attack.getRace() + " legion has won the battle! \n !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    break;
                }
            }
        }

        return victory;
    }
}
