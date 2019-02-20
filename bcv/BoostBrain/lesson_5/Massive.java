package com.bcv.BoostBrain.lesson_5;

//Программирование на Java с нуля #5. Массивы

/*Массивы.
1. Массивы - это наборы однотипных переменных, последовательно расположенные в памяти.
2. Каждая отдельная переменная называется элементом массива.
3. Доступ к элементам массива осуществляется по порядковым номерам или индексам.
4. ВАЖНО! Индексы начинаются с ноля.
5. Объявить массив - означает создать переменную, указывающую на массив.
6. Создать массив - означает выделить память для массива оператором NEW или перечислить значения внутри оператора "{}"(фигурные скобки)

Для объявления массива используется оператор "[]" (квадратные скобки).
Примеры:
Массив целых чисел
int [] integersArray;
Массив байт
byte [] bytesArray;

Создание массива оператором NEW:
Создание массива из 100 целых чисел
int D integerArray = new int[100];
Создание и заполнение массива с помощью оператора
int 0 integerArray = {1,2, 3,4, 5};

Доступ к элементам массива.
Доступ к элементам массива также осуществляется с помощью оператора "[]"
int [] integerArray = {1,2,3,4,5};
int fifthElement = integerArray[4]; //Нумерация начинается с ноля!
Значение переменной fifthElement будет соответствовать пятому элементу массива, то есть будет равняться 5.
integerArray [0] = 100;
А первый элемент массива, теперь будет равняться 100.

Доступ к элементам массива.
Длину массива можно узнать из свойства массива с именем length:
int [] array = {1,2,3,4,5}; //Объявляем и заполняем массив
int arrayLength = array.length; //Копируем длину массива в переменную
Переменная arrayLength будет равняться 5.
*/

public class Massive {
    public static final class Account {
	private float money;
	private String name;

	public float getMoney() {
	    return money;
	}

	public void setMoney(float money) {
	    this.money = money;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}
    }

    public static void main(String[] args) {
	// создадим массив из 5 элементов
	Account[] accounts = new Account[5];

	accounts[0] = new Account();
	accounts[0].setName("Sergey");
	accounts[0].setMoney(100f);

	accounts[1] = new Account();
	accounts[1].setName("Ivan");
	accounts[1].setMoney(150f);

	accounts[2] = new Account();
	accounts[2].setName("Dima");
	accounts[2].setMoney(100f);

	accounts[3] = new Account();
	accounts[3].setName("Maksim");
	accounts[3].setMoney(100f);

	accounts[4] = new Account();
	accounts[4].setName("Yura");
	accounts[4].setMoney(100f);

	for (int i = 0; i < accounts.length; i++) {
	    float currentMoney = accounts[i].getMoney();
	    currentMoney = currentMoney + currentMoney * 0.1f;
	    accounts[i].setMoney(currentMoney);

	}

	for (int i = 0; i < accounts.length; i++) {
	    System.out.println("Name: " + accounts[i].getName() + " money: " + accounts[i].getMoney());
	}

    }
}
/*
Name: Sergey money: 110.0
Name: Ivan money: 165.0
Name: Dima money: 110.0
Name: Maksim money: 110.0
Name: Yura money: 110.0
*/
