package com.company;

import java.sql.SQLOutput;

public class Battle {

    public boolean fight(Army atk, Army target) {
        boolean victory = true;

        while (atk.getLegion().isEmpty() != true && target.getLegion().isEmpty() != true) {
            int thisDmg = atk.getLegion().get(0).getDmg() - (target.getLegion().get(0).getArm() / 10);
            int targetDmg = target.getLegion().get(0).getDmg() - (atk.getLegion().get(0).getArm() / 10);
            int thisHp = atk.getLegion().get(0).getHp();
            int targetHp = target.getLegion().get(0).getHp();

            target.getLegion().get(0).setHp(targetHp - thisDmg);
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
            if (target.getLegion().isEmpty() == true) {
                System.out.println(atk.getRace() + " army has won the battle with " + atk.getUnits() + " unit(s) remaining (" + atk.getLegion().get(atk.getLegion().size() - 1).getHp() + " HP)");
                break;
            }
            if (atk.getLegion().isEmpty() == true) {
                victory = false;
                System.out.println(target.getRace() + " army has won the battle with " + target.getUnits() + " unit(s) remaining (" + target.getLegion().get(target.getLegion().size() - 1).getHp() + "HP)");
                break;
            }
        }
        return victory;
    }
}
