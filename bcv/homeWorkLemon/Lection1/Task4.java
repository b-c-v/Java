package com.bcv.homeWorkLemon.Lection1;

/*В переменной n хранится натуральное трёхзначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр числа n.*/

public class Task4 {
    public static void main(String[] args) {
        int sum, n, n1, n2, n3;

        n = 555;
        n1 = n / 100;
        n2 = (n - (n1 * 100)) / 10;
        n3 = n - (n1 * 100 + n2 * 10);
        sum = n1 + n2 + n3;
        System.out.println(sum);

//Second variant
        n1 = n % 10;
        n2 = (n / 10) % 10;
        sum = n1 + n2;
        n3 = n / 100;
        sum = sum + n3;
        System.out.println("Second variant: " + sum);
    }
}
