package com.bcv.basics;

public class BooleanLogicOperators {
    public static void main(String[] args) {

        /** Булевые логические операторы **/
        // & Логическое И (AND)
        boolean a = true & false; // чтобы было true надо чтобы оба были одинаковы
        System.out.println("a=" + a);

        // | Логическое ИЛИ (OR)
        boolean b = true | false; // когда один из оперантов будет true -> true
        System.out.println("b=" + b);

        // ^ Логическое исключающее ИЛИ (XOR)
        boolean с = false ^ true; // когда один из оперантов будет true, а другой false -> true
        System.out.println("c=" + с);

        // ! Логическое унарное НЕТ (NOT)
        boolean d = true;
        boolean e = !d; // e равно не d т.е. если e-true -> d-false делает наоборот
        System.out.println("e=" + e);

        // &= AND с присваиванием
        boolean g = true;
        g &= false; // g=g&false
        System.out.println("g=" + g);

        // |= OR с присваиванием
        boolean w = true;
        w |= false; // w= w|false
        System.out.println("w=" + w);

        // ^= XOR с присваиванием
        boolean k = false;
        k ^= false; // k= k^false
        System.out.println("k=" + k);

        // == равно
        boolean l = true;
        boolean m = true;
        boolean o = m == l;
        System.out.println("o=" + o);

        // != не равно
        boolean p = true;
        boolean q = true;
        boolean r = p != q;
        System.out.println("r=" + r);

        // || Замыкающее ИЛИ (OR)
        boolean s = true;
        boolean t = true;
        boolean u = s || t; // разница с "|" не вычисляется выражение второго аперанта t если s истина
        System.out.println("u=" + u);
        int i = 0;
        if (i == 0 || i++ == 0) // вторая часть не выполняется т.к. выполнилось первое условие. Если оставить одну "|" будет выводить переменную i=1
        {
            System.out.println("YES");
        }
        System.out.println("i=" + i);
        // && Замыкающее И (AND)
        boolean v = true;
        boolean w1 = false;
        boolean x = v && w1; // как и в "ИЛИ" вторая часть не выполняется только если ПЕРВОЕ условие не выполняется
        System.out.println("x=" + x);

        int k1 = 0;
        if (k1 == 0 && k1++ == 0) // вторая часть не выполняется т.к. НЕ выполнилось первое условие.
        {
            System.out.println("YES-YES");
        }
        System.out.println("k1=" + k1);


    }
}
