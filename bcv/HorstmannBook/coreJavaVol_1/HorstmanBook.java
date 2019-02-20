package com.bcv.HorstmannBook.coreJavaVol_1;

import java.util.Date;

public class HorstmanBook {
    public static void main (String[]args){
       System.out.printf ("%,.2f", 10000/30.0);
               System.out.printf("\n%1$s %2$te %2$tB , %2$tY", "Due date:", new Date());
    }
}
