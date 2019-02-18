package com.bcv.lessons.basics;

public class ArithmeticOperators {
    public static void display(int value) {
        System.out.println("Binary=" + Integer.toBinaryString(value) + " Decimal=" + value);
    }

    public static void main(String[] args) {
        /** Арифметические операторы Java **/
        // +, -, *, /, %
        int a = 10 + 15; //a=25
        int b = 10 - 15; //b=-5
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        /*byte+byte = int
        byte+short = int
        byte+int = int
        byte+char = int
        short+short = int
        short+char = int
        short+long = long
        double + float = double
        int + double = double
        int + long = long
        long + long = long
        long + float = float
        char + char = int
        char + int = int
        char + double = double

        byte -> short ---->
                            int -> long -> float -> double
                 char ---->
        */

        /** при делении если делим меньшее число на большее получим в результате 0.
         т.к. int это целочисленный оперант.**/
        int c = 4 / 5; //c=0
        System.out.println("c=" + c);


        /** получение остатка при делении т.е. если в выше при делении меньше на большее результат 0.
         В данном случае будет вывыодится остаток при делении т.е. если делить 4 на 5 ответ 0 целых и остаток 4
         Если первое число (делимое) со знаком минус, к результату добавляете знак минус**/
        int d = 4 % 5; //d=4
        int dNegative = -4 % 5; //dNegative=-4
        System.out.println("d=" + d);
        System.out.println("dNegative=" + dNegative);

        // java понимает последовательность математических действий
        int e = 2 + 2 * 2; //e=6
        System.out.println("e=" + e);

        // ++ инкремент
        int f = 11;
        int h = 12;
        System.out.println("f=" + ++f); //f=12 префиксный в данном случае сначала идет добавление 1 потом присвоение этого значения переменной
        System.out.println("h=" + h++); //h=12 постфиксный сначала идет присвоение h=h и выводит это на экран, поэтому в результате получается число 11. Прибавляет уже после вывода.
        f = ++f + f++ + ++f + ++f + f++ + ++f;
        System.out.println("f1=" + f); //13+13+15+16+16+18 = 91
        //f = ++11; //CE Variable expected
        //f = ++(++f); //CE Variable expected

        /*final int ff = 4;
        ff++; //CE cannot assign to final variable */

        /*Difference between f++ and f = f+1*/
        byte fa = 125;
        byte fb = 1;
        // byte fc = fa+fb; //CE incompatible types found: int required: byte
        // byte fd = fa+1;  //CE incompatible types found: int required: byte
        byte fc = (byte) (fa + fb); //OK
        byte fe = ++fa; //means fe = (byte)(fa+1)
        System.out.println("fc=" + fc + "\nfe=" + fe);


        // -- декремент
        int k = 14;
        System.out.println("k=" + --k); //k=13

        int l = 15;
        System.out.println("l=" + l--); //l=15

        // += присваивание со сложением
        int m = 1;
        m += 19; //m=20 m=m+19;
        System.out.println("m=" + m);
        // -= присваивание с вычитаением
        int n = 1;
        n -= 18; //n=-17 n=n-18;
        System.out.println("n=" + n);

        // *= присваиванеи с умножением
        int p = 2;
        p *= 19; //p=38 p=p*19;
        System.out.println("p=" + p);

        // /= присваивание с делением
        int q = 19;
        q /= 2; //q=9 q=q/19;
        System.out.println("q=" + q);

        //%= присваивание с вычислением остатка т.е. 19/2=9 и 1 в остатке. Выводит 1.
        int r = 19;
        r %= 2; //r=1 r=r%2;
        System.out.println("r=" + r);


        /*NaN - Non a Number
         Float, Double classes contains a constant NaN*/
        double nD = 0.0;
        double nD1 = 0.0;
        double nan = nD / nD1; //NAN = NaN
        double nanNegative = -0d / 0d; //nanNegative = NaN

        System.out.println("NAN = " + nan + "; nanNegative = " + nanNegative);
        System.out.println(10 < Float.NaN); //false
        System.out.println(10 <= Float.NaN); //false
        System.out.println(10 >= Float.NaN); //false
        System.out.println(10 > Float.NaN); //false
        System.out.println(Float.NaN == Float.NaN); //false
        System.out.println(Double.NaN != Float.NaN); //true
        System.out.println(10 != Float.NaN); //true


    }
}
