package com.bcv.basics;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x=" + x); //x=5

        int y, z;
        y = z = x;
        System.out.println("y=" + y); //y=5
        System.out.println("z=" + z); //z=5
        x = y = z = 20;
        System.out.println("x1=" + x); //y=20
        System.out.println("y1=" + y); //y=20
        System.out.println("z1=" + z); //z=20

        int e = x = y = z = 50;
        System.out.println("x2=" + x); //y=50
        System.out.println("y2=" + y); //y=50
        System.out.println("z2=" + z); //z=50
        System.out.println("e=" + e);

//        int e1=x1=y1=20; //CE cannot resolve symbol

        e = x = y = z = 10;
        e += x -= y *= z /= 2; //-30
        /*
        z = z / 2 =10 / 2 = 5
        y = y * z = 10 * 5 = 50
        x = x - y = 10 - 50 = -40
        e = e + x = 10 +(-40)= -30
        */

        System.out.println("e=" + e + "; x=" + x + "; y=" + y + "; z=" + z); //e=-30; x=-40; y=50; z=5


        boolean b = false;
        if (b = true)
        /**
         * вместо оператора сравнения "==" применили оператор присваивания. поэтому
         * несмотря на то, что ранее в коде b присвоили false, но после if присвоили
         * true - это ошибка Правильно if b==true
         **/
            System.out.println(true);
        else
            System.out.println(false);
    }
}
