package com.company;

public class Warrior {
    private String name;
    private int hp;
    private int dmg;
    private int armor;
    private boolean isAlive = true;


    public Warrior() {
        this.name = "Nameless Warrior";
        this.hp = 50;
        this.dmg = 5;
        this.armor = 0;
    }

    public Warrior(String name, int hp, int dmg, int arm) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.armor = arm;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (getHp() <= 0) {
            isAlive = false;
        }
    }

    public int getDmg() {
        return dmg;
    }

    public int getArmor() {
        return armor;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean duel(Warrior target) {
        boolean win = true;
        while (target.getHp() > 0 && this.getHp() > 0) {
//            System.out.println("NEXT ROUND!!!!!! ");
            System.out.println(this.name + " " + this.getHp());
            System.out.println(target.name + " " + target.getHp() + "\n" + "-");
            int dmgDone = getDmg() - (target.getArmor());
            int dmgDoneBack = target.getDmg() - (this.getArmor());
            if (dmgDone < 0) {
                dmgDone = 0;
                target.setHp(target.getHp() - dmgDone);
            } else {
                target.setHp(target.getHp() - dmgDone);
            }
            if (target.getHp() > 0) {
                if (dmgDoneBack < 0) {
                    dmgDoneBack = 0;
                    this.setHp(this.getHp() - dmgDoneBack);
                } else {
                    this.setHp(this.getHp() - dmgDoneBack);
                }
            } else {
                System.out.println(name + " deals " + dmgDone + " damage and kills " + target.name + "!!!!!!!!!!!!!!!!! \n\n");
                break;
            }
            if (target.isAlive && this.isAlive) {
                System.out.println(name + " attacks " + target.name + " and deals " + dmgDone + " damage! ");
                System.out.println(target.name + " attacks " + this.name + " back and deals " + dmgDoneBack + " damage! \n" + "-");
//                System.out.println(this.name + " " + this.getHp());
//                System.out.println(target.name + " " + target.getHp() + "\n \n");
            } else {
                System.out.println(name + " attacks " + target.name + " and deals " + dmgDone + " damage! ");
                System.out.println(target.name + " deals " + dmgDoneBack + " damage back and kills " + this.name + "!!!!!!!!!!!!!!!!! \n\n");
                win = false;
                break;
            }
        }
        return win;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                ", arm=" + armor +
                ", isAlive=" + isAlive +
                '}';
    }

}
