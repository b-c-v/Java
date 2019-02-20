package com.bcv.basics;

public class RelationalOperators {
    public static void display(int value) {
        System.out.println("Binary=" + Integer.toBinaryString(value) + " Decimal=" + value);
    }

    public static void main(String[] args) {
        /** Операторые сравнения Java **/
// == равно
        boolean a = 3 == 4;
        System.out.println("a:" + a); //false

// != не равно
        boolean b = 3 != 4;
        System.out.println("b:" + b); //true

// > больше
        System.out.println(2 > 3); //false

// < меньше
        System.out.println(2 < 3); //true

// >= больше или равно
        System.out.println(3 >= 3); //true

// <= меньше или равно
        System.out.println(3 <= 4); //true

//we can apply relational operators for every primitive type except boolean
        System.out.println('a' < 101); //true
//        System.out.println("a">'a'); //CE operator > cannot be applied to String
//        System.out.println(true>=true); //CE operator >= cannot be applied to boolean
//        System.out.println(10<20<30); //CE operator < cannot be applied to int and boolean
    }
}
