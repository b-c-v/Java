package com.bcv.homeWorkLemon.Lection9;

import java.util.*;

public class XOGameMy {
    public static void main(String[] args) {
        Collection userOne = new ArrayList<String>(Arrays.asList("0", "3", "1", "6"));

        Collection userTwo = new ArrayList<String>(Arrays.asList("7", "2", "5", "4"));


        //Wins combination in rows
        Collection winCombination1 = new ArrayList<String>(Arrays.asList("0", "1", "2"));
        Collection winCombination2 = new ArrayList<String>(Arrays.asList("3", "4", "5"));
        Collection winCombination3 = new ArrayList<String>(Arrays.asList("6", "7", "8"));

        //Wins combination in columns
        Collection winCombination4 = new ArrayList<String>(Arrays.asList("0", "3", "6"));
        Collection winCombination5 = new ArrayList<String>(Arrays.asList("1", "4", "7"));
        Collection winCombination6 = new ArrayList<String>(Arrays.asList("2", "5", "8"));

        //Wins combination in diagonals
        Collection winCombination7 = new ArrayList<String>(Arrays.asList("0", "4", "8"));
        Collection winCombination8 = new ArrayList<String>(Arrays.asList("2", "4", "6"));

        //Who wins
        if (userOne.containsAll(winCombination1) || userOne.containsAll(winCombination2) || userOne.containsAll(winCombination3) || userOne.containsAll(winCombination4) || userOne.containsAll(winCombination5) || userOne.containsAll(winCombination6) || userOne.containsAll(winCombination7) || userOne.containsAll(winCombination8)) {
            print("First user is winner");
        } else if (userTwo.containsAll(winCombination1) || userTwo.containsAll(winCombination2) || userTwo.containsAll(winCombination3) || userTwo.containsAll(winCombination4) || userTwo.containsAll(winCombination5) || userTwo.containsAll(winCombination6) || userTwo.containsAll(winCombination7) || userTwo.containsAll(winCombination8)) {
            System.out.println("Second user is winner");
        } else {
            print("Nobody win");
        }

    }

    public static void print(String S) {
        System.out.println(S);
    }

}

