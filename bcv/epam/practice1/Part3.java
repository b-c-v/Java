package com.bcv.epam.practice1;

public class Part3 {
    public static void main(String[] args) {
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < args.length; ++i) {
            bld.append(args[i] + " ");
        }
        System.out.println(bld.toString().trim());
    }
}

