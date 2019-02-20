package com.bcv.BoostBrain.lesson_8;

public class Links {
    public static void main(String[] args) {
	// создаем 2 целочисленных массива
        int[] first;
        int[] second;
	
	// создаем массив из 10 переменных типа int т.е. создаем массив из 10 переменных и ссылка на него присваивается переменной first 
	first = new int[10];
	
	// присваиваем массиву second значение first, чтобы убедиться что first и second указывают на одно и ту же область памяти
	second = first;
	// заполним массив first элеметами от 0 до 9 
	for (int i=0; i < 10; i++) {
	    first[i] = i;
	}
	System.out.println("First");
	for (int i = 0; i < 10; i++) {
	    System.out.println("First - " +first[i]);
	}
	System.out.println("Second");
	for (int i = 0; i < 10; i++) {
	    System.out.println("Second - " +second[i]);
	    
	}
	// присваиваем 5 элементу в массиве значение 100
	first[5]=100;
	System.out.println("First 5 is 100");
	for (int i = 0; i < 10; i++) {
	    System.out.println("First - " +first[i]);
	}
	// ничего не меняя в массиве second выводим его и видим, что в нем тоже изменилось 5 число массива на 100
	System.out.println("Second 5 is 100");
	for (int i = 0; i < 10; i++) {
	    System.out.println("Second - " +second[i]);
	}
    }
}
