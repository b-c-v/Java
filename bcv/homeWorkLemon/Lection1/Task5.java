package com.bcv.homeWorkLemon.Lection1;

//Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.

public class Task5 {
    public static void main(String[] args) {
        float myWeightEarth = (float) 85;
        float gravityMoon = (float) 0.17;
        float myWeightMoon = (myWeightEarth * gravityMoon);
        System.out.println(myWeightMoon);
    }
}
