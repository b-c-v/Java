package com.bcv.lessons.basics;

public class ConcatenationString {
    public static void main(String[] args) {

        String a = "Hello";
        int b = 10;
        char c = 97;
//        b = a+b; //CE incompatible type found String, required int
        b = c+b; //107
        System.out.println(a+b+c); //Hello10a
        System.out.println(b);

    }
}
