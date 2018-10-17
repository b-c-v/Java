package com.bcv.lessons;
//count numbers Fibonacci with recursion method

public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;

        for (int rowNubmer = 0; rowNubmer < number; rowNubmer++) {

            System.out.println("fib(" + rowNubmer + ") = " + fib(rowNubmer));
            System.out.println("fibTern(" + rowNubmer + ") = " + fibTern(rowNubmer));
        }
    }

    //use "if" statement
    private static int fib(int arg) {

        if (arg == 0 || arg == 1) {
            return 1;
        } else {
            return fib(arg - 1) + fib(arg - 2);
        }

    }

    //use ternary statement
    private static int fibTern(int arg) {
        return (arg < 2) ? 1 : fib(arg - 1) + fib(arg - 2);
    }
}
