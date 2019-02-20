package com.bcv.basics;
//импортируем библиотеку Scanner


/**
 * Класс_Инструкция {
 * Метод_Как включить телефон(){
 * Зажмите кнопку 1
 * }
 * Метод_Как установить игру(){
 * Подключите к компьютеру
 * Запустите файл
 * }
 * }
 */


import java.util.Scanner;


public class ReadFromKeyboardMain {
    /* создаем метод входа
      (1)доступность (2)идентификатор (3)тип_возвращения (4)имя((5)парамтеры){(5)тело метода}
      1) идентификатор доступности public, private, protected
      2) static finale
      3) void - тип возвращения (параметры)
      4) main
      5) String args[]*/

    public static void main(String[] args) {
       /* вызвать метод скан из класса ReadFromKeyboard.
        Создаем объект типа ReadFromKeyboard и приравниваем его к новому объекту типа ReadFromKeyboard
        создаем переменную на все что есть в класе ReadFromKeyboard*/
        ReadFromKeyboard r = new ReadFromKeyboard();

        r.scanMethod(); //вызываем метод scanMethod из класса ReadFromKeyboard
        r.i = count(r.i); // i равен тому что возвращает метод count, метод count расценивает этот i как х
        r.k = count(r.k); // в один и тот же метод count отправляем 2 переменные k и i.
        System.out.println("Now your first number is = " + r.i);
        System.out.println("Now your second number is = " + r.k);
    }

    private static int count(int x) {
        // x=x+1
        x += 1; // все что вычисляется справа приравнивается к тому что слева: сначала вычислает х+1, а потом присваивает результат к х
        return x;
    }

}

//клас инициализирует переменные i, k и считывает то, что мы ввели с клавиатуры
class ReadFromKeyboard {
    int i;
    int k;


    //создаем метод который считывает с клавиатуры
    public void scanMethod() {
        System.out.println("Enter first number:");
//создаем ссылку на объект типа Scanner из библиотеки java.util и как параметр передали system.in т.е. то что вводится с клавиатуры
        Scanner scn = new Scanner(System.in);
//приравниваем к переменной i значение того что ввели с клавиатуры с помощью метода next.int
        i = scn.nextInt();

        System.out.println("Enter second number:");
        k = scn.nextInt();
    }
}