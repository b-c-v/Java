package com.bcv.lessons;

//конкотенация строк
public class Lesson2018_10_01 {
    private String hated = "Our government";

    public static void main(String[] args) {
        new Lesson2018_10_01().hate();
    }

    public void hate() {
        String our = "Our";
        hated = "Govno "+
        hated.substring(hated.indexOf(our) + our.length() + 1, hated.length());
        System.out.println(hated);
    }

}
