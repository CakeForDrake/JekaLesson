package com.company;

public class Warrior {
    private String name;
    private int hp;
    private int dmg;
    private int arm;
    private boolean isAlive;


    public Warrior() {
        this.name = "Nameless Warrior";
        this.hp = 200;
        this.dmg = 15;
        this.arm = 20;
    }

    public Warrior(String name, int hp, int dmg, int arm) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.arm = arm;
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

    public int getArm() {
        return arm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String attack(Warrior target) {
        System.out.println(target.name + " " + target.getHp() + "\n" + "-");
        int dmgDone = getDmg() - (target.getArm() / 10);
        target.setHp(target.getHp() - dmgDone);
        if (!target.isAlive) {
            return name + " deals " + dmgDone + " and kills " + target.name + "!!! ";
        } else {
            System.out.println(target.name + " " + target.getHp());
            return name + " attacks " + target.name + " and deals " + dmgDone + " damage! \n";
        }
    }

    public boolean duel(Warrior target) {
        boolean win = true;
        while (target.getHp() > 0 && this.getHp() > 0) {
            System.out.println("NEXT ROUND!!!!!! ");
            System.out.println(this.name + " " + this.getHp());
            System.out.println(target.name + " " + target.getHp() + "\n" + "-");
            int dmgDone = getDmg() - (target.getArm() / 10);
            int dmgDoneBack = target.getDmg() - (this.getArm() / 10);
            target.setHp(target.getHp() - dmgDone);
            if(target.getHp() > 0){
                this.setHp(this.getHp() - dmgDoneBack);
            } else {
                System.out.println(name + " deals " + dmgDone + " damage and kills " + target.name + "!!! \n");
                break;
            }
            if (target.isAlive && this.isAlive) {
                System.out.println(name + " attacks " + target.name + " and deals " + dmgDone + " damage! ");
                System.out.println(target.name + " attacks " + this.name + " back and deals " + dmgDoneBack + " damage! \n"+ "-");
                System.out.println(this.name + " " + this.getHp());
                System.out.println(target.name + " " + target.getHp() + "\n \n" );
            } else {
                System.out.println(name + " attacks " + target.name + " and deals " + dmgDone + " damage! ");
                System.out.println(target.name + " deals " + dmgDoneBack + " damage back and kills " + this.name + "!!! \n");
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
                ", arm=" + arm +
                ", isAlive=" + isAlive +
                '}';
    }

}
