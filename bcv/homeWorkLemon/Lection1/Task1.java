package com.bcv.homeWorkLemon.Lection1;

/*В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на
экран результат деления q на w с остатком. Пример вывода программы (для случая, когда
в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.*/

public class Task1 {
    public static void main(String[] args) {
        int x, y, z, w;
        x = 10;
        y = 3;
        z = x % y;
        w = x / y;
        System.out.println(x + " / " + y + " = " + w + " и " + z + " в остатке");
    }

}
