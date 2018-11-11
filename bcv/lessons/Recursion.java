package com.bcv.lessons;
//lection 3 part 1
public class Recursion {
    public static void main(String[] args) {
        methodRecursion(1);
    }

    private static void methodRecursion(int arg) {
        System.out.print(arg + " ");
        if (arg < 7) {
            //call method inside himself
            methodRecursion(2 * arg);
        }

        System.out.print(arg + " ");

    }


}
