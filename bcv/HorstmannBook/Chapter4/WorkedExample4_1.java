package com.bcv.HorstmannBook.Chapter4;

/**
 * Design a class for computing the volume and surface area of a pyramid
 */

public class WorkedExample4_1 {
    public static void main(String[] args) {
        Pyramid aPyramid = new Pyramid(10, 10);
        System.out.println(aPyramid.getSurface());
        System.out.println(aPyramid.getVolume());
    }
}


class Pyramid {
    private double height;
    private double baseLength;


    public Pyramid(double aHeight, double aBaseLength) {
        height = aHeight;
        baseLength = aBaseLength;

    }

    public double getVolume() {
        return baseLength * baseLength * height / 3;
    }

    public double getSurface() {
        double sideLength = Math.sqrt(Math.pow(height, 2) + Math.pow(baseLength, 2) / 4);
        return Math.pow(baseLength, 2) + 2 * baseLength * sideLength;
    }
}




