package com.bcv.epam.practice1;
public class Part4 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        for (int i = 0; i < args.length; i++) {
            while (x != y) {
                if (x > y) {
                    x = x - y;
                } else {
                    y = y - x;
                }
            }
        }
        System.out.println(x);
    }
}
