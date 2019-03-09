package com.bcv.basics;

/*
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
int 0 integerArray = {1,2,3,4,5};

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
public class Arrays {

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

        //**********************************************


        //если сразу заполнять массив - СE если в объявлении использовать более 2-х []
//        int[][][] initialArray = {{1, 3, 3}, {1, 2, 3}, {1, 1, 1}}; //incompatable types found: int; required: int[]
        int[][] initialCorrectArray = {{1, 3, 3}, {1, 2, 017}, {0x981FAA, 0b10101, 'c'}};
        int[][][][] notInitialArray = new int[(int) 2.0][3][1][1];
        System.out.println("все массивы при создании заполняются 0 или null:" + notInitialArray[1][0]);
        String[][] stringArray = new String[2][3];
        stringArray[1][2] = "Hello world";
        System.out.println(stringArray[0][1]);

        //в качестве указателя может использоваться char (он приводится к int), byte, short, int
        int y = 10;
        char arrayChar = 'r';
        int[][][] array = new int[3][arrayChar]['b'];
        array[1][0] = new int[y];
        for (int i = 0; i < y; i++) {
            array[1][0][i] = (int)(Math.random() * 10);
            System.out.print (array[1][0][i] + " ");

        }



    }
}

/*
Name: Sergey money: 110.0
Name: Ivan money: 165.0
Name: Dima money: 110.0
Name: Maksim money: 110.0
Name: Yura money: 110.0
все массивы при создании заполняются 0 или null:[[I@74a14482
null
6 2 7 7 8 9 6 9 4 3
*/