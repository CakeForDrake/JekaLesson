package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        int mmr = 1000;
//        String d = "dick";
//        mmr = 3000;
//        int sw = 30;
//        int sl = -30;
//        int pw = 20;
//        int pl = -20;
//
//        int[] array = {1, 2, 4, 12, 444, 322};
//        array[2] = 169;
//        array[5] = array[0] + array[1] + array[2];
//
//
//        System.out.println(array[3 + 2]);
//        System.out.println(Arrays.toString(array));
//
//
//        System.out.println("Zdarova Master!");
//        System.out.println(mmr + " " + mmr + " Points " + 123);
//        System.out.println(mmr + "123");
//        System.out.print(mmr);
//        System.out.print(mmr + 123 + "\n");
//
//        mmr = mmr + sw * 2 + pl + pl + pl + 3 * sw;
//        int mmrnew = mmr + sw * 2 + pl + pl + pl + 3 * sw;
//        if (array[0] != array[4]) {
//            System.out.println("qq");
//        } else {
//            System.out.println("gg");
//        }
//        for(int i = array.length-1 ;i >= 0; i--){
//            System.out.println(array[i]);
//        }
//
//        System.out.println(mmr + " - Real mmr! " + d + " " + mmrnew + "\n\n\n");
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] >= 200) {
//                array[i] = array[i] * 2;
//            }
//            else {
//                System.out.println(array[i]);
//            }
//        }
//        int sum = 0;
//        for (int i = 0;i < array.length; i++) {
//            sum += array[i];
//
//        }
//        System.out.println(sum);

//        int x = (int) (Math.random() * 1000);


//        Math.random();
//        int[] numbers = new int[25];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random() * 1000 - 500);
//        }
//
//        System.out.println(Arrays.toString(numbers));
//
//        int num = 0;
//        int maxnum = 0;
//        int minnum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            num = numbers[i];
//            if (i == 0) {
//                maxnum = numbers[0];
//                minnum = numbers[0];
//            }
//            if (num > maxnum) {
//                maxnum = num;
//                minnum = maxnum;
//            }
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            num = numbers[i];
//            if (num < minnum) {
//                minnum = num;
//            }
//        }
//        System.out.println("\n"+"MinNum = " + minnum + ", MaxNum = " + maxnum +"\n");
//
////        !!!!!!! and = &&
////        !!!!!!! or = ||
//
//        for (int out = numbers.length - 1; out >= 0; out--) {
//            for (int in = 0; in < numbers.length - 1; in++) {
//                if (numbers[in + 1] > numbers[in]) {
//                    int x = numbers[in + 1];
//                    numbers[in + 1] = numbers[in];
//                    numbers[in] = x;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//        if (minnum == numbers[numbers.length - 1] && maxnum == numbers[0]) {
//            System.out.println("\n"+"Жека ахуєнний вчитель" + "\n");
//        } else {
//            System.out.println("\n"+"Жека дніщє єбаноє" + "\n");
//        }
//
//        int[][] multi = new int[9][9];
//        int[][] mbit = new int [16][16];
//
//        for (int y = 0; y < multi.length; y++) {
//            for (int x = 0; x < multi.length; x++) {
//                multi[y][x] = (y + 1) * (x + 1);
//            }
//        }
//        System.out.println("Multi Tab"+"\n");
//        for (int y = 0; y < multi.length; y++) {
//            System.out.println(Arrays.toString(multi[y]));
//
//        }
//        for (int y = 0; y < mbit.length; y++) {
//            for (int x = 0; x < mbit.length; x++) {
//                mbit[y][x] =  (int) Math.pow(2,y) * (x + 1);
//            }
//        }
//        int[] bits = new int[32];
//        for(int i = 0; i < bits.length; i++){
//            bits[i] = (int) Math.pow(2,i);
//        }
//        System.out.println("\n" + Arrays.toString(bits) + "\n");
//        System.out.println("\n" + "Mbit System" + "\n");
//        for (int y = 0; y < multi.length; y++) {
//            System.out.println(Arrays.toString(mbit[y]));
//        }
//        Warrior dima = new Warrior("dima", 100, 35, 20);
//        Warrior vova = new Warrior();
//        Knight dima = new Knight();
//
//        System.out.println(dima.isAlive());
//        System.out.println(vova.duel(dima));

//        System.out.println(dima);


        Army gouls = new Army("Undead",10);
        Army paladins = new Army();
//
        paladins.addUnit(new Warrior(),4);
        paladins.addUnit(new Defender(),4);
        paladins.addUnit(new Knight(),2);
        paladins.setRace("Human");

        Battle holyWar = new Battle();
        holyWar.fight(paladins,gouls);
    }
}

