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
        if (hp <= 0) {
            isAlive = false;
            this.hp = 0;
            return;
        }
        this.hp = hp;
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
        while (this.isAlive() && target.isAlive()) {
            if (this.getDmg() > target.getArmor()) {
                target.setHp(target.getHp()-this.getDmg()+target.getArmor());
                if (!target.isAlive()) {
                    return true;
                }
            }
            if (target.getDmg() > this.getArmor()) {
                this.setHp(this.getHp()-target.getDmg()+this.getArmor());
                if (!this.isAlive()) {
                    return false;
                }
            }
        }
        return this.isAlive();
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
