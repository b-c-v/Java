package com.bcv.basics;

public class BitwiseOperators {

    public static void display(String name, int value) {
        System.out.println(name + " Binary=" + Integer.toBinaryString(value) + "; Decimal=" + value);
    }

    public static void main(String[] args) {

        /** Битовые (поразрядные) операторы**/

/* ~ Унарное отрицание (NOT)
        все нулевые биты в числе a1 изменены на единичные биты в числе a2, а единичные биты в a1 изменены на нулевые биты
         меняет знак и добавляет +1 к числу*/
        int a1 = 0b10101010101010101001010101010;
        int a2 = ~a1;
        display("NOT", a1); //Binary=   10101 01010101 01010010 10101010 Decimal=357913258
        display("NOT", a2); //Binary=11101010 10101010 10101101 01010101 Decimal=-357913259
        display("NOT", ~5); //Binary=11111111111111111111111111111010; Decimal=-6

// & Поразрядное И (AND)
        // если оба операнта 1 значит результат 1 в бинарном виде. Поэтому у нас получилось 101000
        int b1 = 0b101010;
        int b2 = 0b111101;
        int b3 = b1 & b2;
        display("AND", b1); //Binary=101010 Decimal=42
        display("AND", b2); //Binary=111101 Decimal=61
        display("AND", b3); //Binary=101000 Decimal=40
        display("AND", 4&5); //Binary=100; Decimal=4

// | Поразрядное ИЛИ (OR)
        // если хотябы один оперант 1 знатич результат 1 в бинарном виде. Поэтому у нас получилось 1111011
        int c1 = 0b101000;
        int c2 = 0b111101;
        int c3 = c1 | c2;
        display("OR", c1); //Binary=101000 Decimal=40
        display("OR", c2); //Binary=111101 Decimal=61
        display("OR", c3); //Binary=111101 Decimal=61
        display("OR", 4|5); //Binary=101; Decimal=5

// ^ Порязрядное исключение ИЛИ (XOR)
        // если один из оперантов равен 0, а другой равен 1 значит результат будет 1. Во всех остальных случаях будет присваиваться 0 - поэтому получилось 010111, но вначале нет 0 т.к. он не показывается
        int d1 = 0b101010;
        int d2 = 0b111101;
        int d3 = d1 ^ d2;
        display("XOR", d1); //Binary=101010 Decimal=42
        display("XOR", d2); //Binary=111101 Decimal=61
        display("XOR", d3); //Binary= 10111 Decimal=23
        display("XOR", 4^5); //Binary=1; Decimal=1
// << Сдвиг битов влево
        // свдигает все разряды сдвигает влево, а в конце добавляет 0. Когда нам надо умножить число на 2.
        int e1 = 0b101010101010101010101010;
        display("<<", e1);            //Binary=101010101010101010101010  Decimal=11184810
        display("<<", e1 << 1); //Binary=1010101010101010101010100 Decimal=22369620
        display("<<", 5<<1); //Binary=1010; Decimal=10

// >> Сдвиг битов вправо
        // правый бит исчезает, но слева появляется 0, но он не показывается. Когда необходимо разделить на 2.
        int f1 = 0b101010101010101010101010;
        display(">>", f1);            //Binary=101010101010101010101010 Decimal=11184810
        display(">>", f1 >> 1); //Binary=10101010101010101010101  Decimal=5592405

// >>> Сдвиг битов вправо с заполнением старшего бита нулем
        // Всегда слева добавляется 0. т.е. при отрицательном числе будем получаться положительное число
        int g1 = 0b101010101010101010101010;
        display(">>>", g1);
        for (int i = 1; i <= 24; i++)
            display(">>>", g1 >>> i);
       /*
       >>> Binary=101010101010101010101010 Decimal=11184810
       >>> Binary=10101010101010101010101 Decimal=5592405
       >>> Binary=1010101010101010101010 Decimal=2796202
       >>> Binary=101010101010101010101 Decimal=1398101
       >>> Binary=10101010101010101010 Decimal=699050
       >>> Binary=1010101010101010101 Decimal=349525
       >>> Binary=101010101010101010 Decimal=174762
       >>> Binary=10101010101010101 Decimal=87381
       >>> Binary=1010101010101010 Decimal=43690
       >>> Binary=101010101010101 Decimal=21845
       >>> Binary=10101010101010 Decimal=10922
       >>> Binary=1010101010101 Decimal=5461
       >>> Binary=101010101010 Decimal=2730
       >>> Binary=10101010101 Decimal=1365
       >>> Binary=1010101010 Decimal=682
       >>> Binary=101010101 Decimal=341
       >>> Binary=10101010 Decimal=170
       >>> Binary=1010101 Decimal=85
       >>> Binary=101010 Decimal=42
       >>> Binary=10101 Decimal=21
       >>> Binary=1010 Decimal=10
       >>> Binary=101 Decimal=5
       >>> Binary=10 Decimal=2
       >>> Binary=1 Decimal=1
       >>> Binary=0 Decimal=0
       */

// &=, |=, ^=, <<=, >>=. >>>= Присвоение с аналогичной операцией
        // h1&=h2 короткая запись h1=h1&h2

        int h1 = 0b101;
        h1 &= 0b110;//h1=h1&1
        display("&=", h1); //&= Binary=100; Decimal=4
        display("&=", h1); //&= Binary=100; Decimal=4
    }
}
