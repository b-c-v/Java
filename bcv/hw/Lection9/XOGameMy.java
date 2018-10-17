package com.bcv.hw.Lection9;

import java.util.*;

public class XOGameMy {
    public static void main(String[] args) {
        Collection winCombination1 = new ArrayList<String>();
        winCombination1.add("2");
        winCombination1.add("4");
        winCombination1.add("6");

        Collection winCombination2 = new ArrayList<String>();
        winCombination2.add("0");
        winCombination2.add("1");
        winCombination2.add("2");
        Collection winCombination3 = new ArrayList<String>();
        winCombination3.add("3");
        winCombination3.add("4");
        winCombination3.add("5");

        Collection winCombination4 = new ArrayList<String>();
        winCombination4.add("6");
        winCombination4.add("7");
        winCombination4.add("8");

        Collection winCombination5 = new ArrayList<String>();
        winCombination5.add("0");
        winCombination5.add("3");
        winCombination5.add("6");

        Collection winCombination6 = new ArrayList<String>();
        winCombination6.add("1");
        winCombination6.add("4");
        winCombination6.add("7");

        Collection winCombination7 = new ArrayList<String>();
        winCombination7.add("2");
        winCombination7.add("5");
        winCombination7.add("8");


        Collection winCombination8 = new ArrayList<String>();
        winCombination8.add("0");
        winCombination8.add("4");
        winCombination8.add("8");

        Collection userOne = new ArrayList<String>();
        userOne.add("4");
        userOne.add("1");
        userOne.add("5");
        userOne.add("7");

        Collection userTwo = new ArrayList<String>();
        userTwo.add("2");
        userTwo.add("3");
        userTwo.add("6");
        userTwo.add("8");

        if (userOne.containsAll(winCombination1) || userOne.containsAll(winCombination2) || userOne.containsAll(winCombination3) || userOne.containsAll(winCombination4) || userOne.containsAll(winCombination5) || userOne.containsAll(winCombination6) || userOne.containsAll(winCombination7) || userOne.containsAll(winCombination8)) {
            System.out.println("First user is winner");
        } else if (userTwo.containsAll(winCombination1) || userTwo.containsAll(winCombination2) || userTwo.containsAll(winCombination3) || userTwo.containsAll(winCombination4) || userTwo.containsAll(winCombination5) || userTwo.containsAll(winCombination6) || userTwo.containsAll(winCombination7) || userTwo.containsAll(winCombination8)) {
            System.out.println("Second user is winner");
        } else {
            System.out.println("Nobody win");
        }

    }
}

