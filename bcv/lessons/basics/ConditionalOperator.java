package com.bcv.lessons.basics;

public class ConditionalOperator {
    public static void main(String[] args) {
        //выводим абсолютное число т.е. без -
        System.out.println(abs(-100)); //10


        int x = (10>20)?30:(40>50)?60:70; //70
        System.out.println(x);

    }

    /**
     * Тернарный оператор ?:
     **/

    // ?: тернарный операторв\
    private static int abs(int value) {
        int abs;
//		if(value<0)
//			abs=-value;
//		else
//			abs=value;

//код сверху в укороченном виде через тернарный операторв
        abs = value < 0 ? -value : value; // если (IF) "выражение 1" истина "?" то возвращаем "выражение 2" иначе (ELSE) "выражение 3"

        return abs;
    }
}
