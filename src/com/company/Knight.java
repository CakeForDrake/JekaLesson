package com.company;

public class Knight extends Warrior {

    public Knight() {
        super("Nameless Knight",100,35,10);
    }

    public Knight(String name,int hp,int dmg,int arm){
        super(name,hp,dmg,arm);
    }


//    public void fight(Knight target) {
//
//        for (int i = target.getHp(); i <= 0 ; i = target.getHp() )
//
//        System.out.println(target.name + " " + target.getHp() + "\n" + "-");
//
//        int dmgDone = getDmg() - (target.getArm() / 10);
//
//        target.setHp(target.getHp() - dmgDone);
//
//        System.out.println(target.name + " " + target.getHp());
//
//        if (!target.isAlive) {
//
//            System.out.println(name + " deals " + dmgDone + " and kills " + target.name + "!!! \n");
//
//            return;
//
//        } else {
//
//            System.out.println(name + " attacks " + target.name + " and deals " + dmgDone + " damage! \n");
//
//            return;
//        }
//
//    }


}
