package com.bcv.lessons;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int a = 153;

//count degree(stepen) of number a
        int aDegree = 0;
      /*  while (a > 0) {
            a = a / 10;
            aDegree++;
            System.out.println("aDegree = " + aDegree);
        }*/

        while (a > 0) {
            int w = a % 10; // a = 153%10 == 3
            a = a / 10; //a=153/10=15
            aDegree++;

            System.out.println("a = " + a + " w = "+w);
           if (w>0){
            int pol = (int)Math.pow(w, aDegree);
            System.out.println("pol = " + w + "^" + aDegree + "=" + pol);


        }
        // int m = (int) Math.pow(x,aDegree)+ (int)Math.pow(x, aDegree);
        // System.out.println(m);
    }

}}
//count armstrong number



