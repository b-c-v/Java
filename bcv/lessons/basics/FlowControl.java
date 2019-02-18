package com.bcv.lessons.basics;

public class FlowControl {
    public static void main(String[] args) {

        /** Циклы и операторы ветвления **/

/*
    Операторы выбора
    if-else
    первый пример: если "а" истина - выполняем все что в {}, если ложь else -
    выполняется код в скобках после else
    if(a) { } else { }
*/

        int value = -19;
        if (value < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }

        // второй пример: если "b" истина выполняет код, если ложь - ничего не делает

        /*
         * if(b) { }
         */
        int a = -19;
        if (a < 0) {
            System.out.println("Exemple2");
        }

        // третий пример:

        /*
         * if(c) { // если выражение истина выполняет этот кусок кода, если не истина
         * идем дальше } else if(d) { // если это выражение истина выполняет этот код,
         * если не истина идем дальше } else if(e) {// если это выражение истина
         * выполняет этот код, если не истина идем дальше } } else {} // если ничего не
         * подошло выше - выполняет этот код, но можно и без него как в примере2
         */

        int b = 0;
        if (b < 0) {
            System.out.println("Negative Example 3");
        } else if (b > 0) {
            System.out.println("Positive Example3");
        } else if (b == 0) {
            System.out.println("Zero Example 3"); //Zero Example 3
        }

        //четвертый пример
        boolean bo = false;
        if (bo = true) { //переопредилили переменную bo и присвоили ей значение = true
            System.out.println("bo = true: Hello World"); //bo = true: Hello World
        } else {
            System.out.println("bo = true: Good bye");
        }
        boolean bool = false;
        if (bool == true) //сравнием значения
            System.out.println("bool == true: Hello World");
        else
            System.out.println("bool == true: Good bye"); //bool == true: Good bye

        /*switch*/

        String day = "Вс";
        //allow types for switch argument are byte, short, int, char. From 1.5 version allow types are Byte, Short, Character, Integer, enum. From 1.7 version allow types are String

        // код выводит день недели
        switch (day) {
            case "Пн":
                System.out.println("1:Monday");
                break; // если условие выполнилось - он прерывает код
            case "Вт":
                System.out.println("2:Thuesday");
                break;
            case "Ср":
                System.out.println("3:Wednesday");
                break;
            case "Чт":
                System.out.println("4:Thursday");
                break;
            case "Пт":
                System.out.println("5:Friday");
                break;
            case "Сб":
                System.out.println("6:Saturday");
                break;
            case "Вс":
                System.out.println("2:Sunday");
                break;
            default: // если не одно значение не подошло выводит
                System.out.println("The day cannot recognise");
        }

        // код показывает будний или выходной день недели

        switch (day) {
            case "Пн":
            case "Вт":
            case "Ср":
            case "Чт":
            case "Пт":
                System.out.println("Work days");
                break;
            case "Сб":
            case "Вс":
                System.out.println("Weekend");
                break;
            default: // если не одно значение не подошло выводит
                System.out.println("The day cannot recognise");
        }
        byte x = 10;
        final int y = 20;
        switch (x) {
            case 10:
                System.out.println("Hello");
                break;
            case y: //данный код не выдает ошибку компилятора только потому, что y объявлен как final
                System.out.println("Good Bye");
                break;
          /*  case 1000: //CE because max value of byte is 127
                System.out.println("byte 1000");*/
        }
        //Switch argument and case label can be expressions, but case label should be constant expression
        switch (x + 2) {
            case (10 + 1):
                System.out.println("10+1");
            case (10 + 2):
                System.out.println("10+2"); //10+2

        }

        /*   Циклические операторы*/

        // for - когда необходимо перебрать какие-либо значения, которые идут подряд
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // код выводи значение до тех пор - пока выполняется условие
        }

        for (int f = 0, j = 10; f < 10 && j > 0; f++, j--) {
            System.out.println("f=" + f + " j=" + j); // код выводи значение до тех пор - пока выполняется условие
        }

         /*while
         до тех пор, пока условие в скобке является истинной*/

        int w = 0;
        while (w < 50) {
            w += 19;
            System.out.println("w=" + w); // w=19 w=38 w=57
        }
        boolean wh = true;
//        while (wh = true) { //infinity cycle
        while (wh != false) {
            System.out.println("wh=" + wh); //wh=true
            wh = false;
        }

         /*do-while
        снячала выполняется условие, а потом проверяет выполнять его дальше или не выполнять*/
        String s = "";
        int i = 0;
        do {
            s += i;
            i++;
            System.out.println("do-while=" + s);

        } while (i < 10);

 /*
 //compile successfully
        do ;
        while (true);*/

/*
//compile successfully
       do {
            int xDo = 10;
        } while (true);*/

/*
//compile successfully
do while (true) {
    System.out.println("Horrible while"); //infinity cycle

}while (true);
*/
        final int whileDo = 10;
        final int whileDoFirst = 20;
        do {
            System.out.println("do first");
        } while (whileDo > whileDoFirst);
        System.out.println("while first");

         /*for-loop
         когда необходимо перебрать массив значений*/

        int[] arr = {2, 5, 3, 4, 8, 22, 1, -4};
        // for (initialisation; conditional expression; increment/decrement)
        for (int f = 0; f < arr.length; f++)
            System.out.println("for-loop=" + arr[f]);

        //in initalization section can take any valid java statement
        int iFor = 1;
        for (System.out.println("I'm here only once"); iFor < 3; iFor++) {
            System.out.println("I'm here twice");
      /*    I'm here only once
            I'm here twice
            I'm here twice*/
        }


/*        in conditional expression can take any java expression but should be of the type Boolean.
        Conditional expression is optional and if we are not taking any expression compiler will place true*/

        int iFor1 = 0;
        for (System.out.println("initialization"); iFor1 < 2; System.out.println("increment/decrement section")) {
            iFor1++;
            System.out.println("Body section");
        /*initialization
        Body section
        increment/decrement section
        Body section
        increment/decrement section*/
        }

       /* int iFinalFor1 = 1, iFinalFor = 2; // infinity cycle "Hello Final For"
       // final int iFinalFor1 = 1, iFinalFor = 2; //RE if unreachable statement if this parameters is final
        for (int iForEx = 0; iFinalFor1 < iFinalFor; iForEx++) {
            System.out.println("Hello Final For");
        }*/

        /*for-each-loop
        * we can alway print array elements only from left to right*/
        for (int val : arr)
            System.out.println("for-each-loop=" + val); // сокращает код, вверху написан код, более длиннее

        //print two-dimensional array
        int [][] twoDimensionalArray = {{1,3,4,5},{3,5,6,7,8}};
        //for-loop
        System.out.println("for loop two dimensional array: ");
        for (int iTwoDimensional = 0; iTwoDimensional < twoDimensionalArray.length; iTwoDimensional++) {
            for (int jTwoDimensional = 0; jTwoDimensional < twoDimensionalArray[iTwoDimensional].length; jTwoDimensional++) {
                System.out.print(twoDimensionalArray[iTwoDimensional][jTwoDimensional]+ " ");
            }
        }
        //for-each
        System.out.println("\nfor each loop two dimensional array: ");
        for (int[] aForEachTwo : twoDimensionalArray){
            for (int bForEachTwo : aForEachTwo) {
                System.out.print(bForEachTwo + " ");

            }
        }

        // continue-break (операторы перехода)
        for (int br = 0; br < 10; br++) {
            System.out.println("break=" + br);
            if (br == 5)
                break; // если с=5 то закончить выполнение кода
        }

        for (int co = 0; co < 10; co++) {
            if (co < 5)
                continue; // до тех пор, пока co не будет больше или равно 5 - код ниже не выполняется
            System.out.println("continue=" + co);
        }

        // return
        System.out.println(increment(7));

    }

    public static int increment(int re) {
        return re + 1; // ключевое слово которое ставится в блоке функции и что-то возращает, в данном случае re+1
    }
}
