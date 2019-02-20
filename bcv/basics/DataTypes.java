package com.bcv.basics;

public class DataTypes {
    public static void main(String[] args) {

//         целочисленные (byte 8bit; short 16bit; int 32bit; long 64bit):
        byte bp = 127;
        byte bn = -128;
        short sp = 32767;
        short sn = -32768;
        int ip = 2147483647;
        int in = -2147483648;
        long lp = 9223372036854775807l; //CE !always suffixing whit small "l" or capital "L"
        long ln = -9223372036854775808L;

//         числа с плавающей точкой (float 32bit; double 64bit)
        float fp = 1.23456789012345678901234567890123456789f; //CE !always suffixing whit small "f" or capital "F"
        float fn = -1.23456789012345678901234567890123456789F;
        double dp = 1.12345678901234567890123456789012345678901234567890d; //suffixing whit small "d" or capital "D"
        double dn = -1.123456789012345678123456789012345678901234567890D;

//        логический тип (булевские значения) размер спецификацией не указан
        boolean bf = false; // логический тип данных
        boolean bt = true;

//        символьный тип ( char 16 bit) from 0 to 65535:
        char letter = 'ы';
        char number = 'l';

        //data types with big size can hold types with smaller size. Example: short (2 bytes) = byte; int (4 bytes) = short (2 bytes); long = int; int = char;
        dp = ip;
        dp = letter;
//      sp = letter; !short can't hold char
        ip = letter;
        ip = number;
//        ip = fp; integer can't hold float but float can hold integer
        fp = ip;
        dp = fp;
//      fp = bf; !boolean can't convert in any type & any type can't convert to boolean
        letter = 65300; // char можно задавать числами т.к. каждому символу соотвествует номер в Unicode. Например здесь выведет: ４


        /*удобство записи через подчеркивание _. Если надо визуально отделять порядок чисел используют подчеркивание*/
        double dUnderScope = 123_456_789_0.123_456_789_0;

        // Форма написания в 2-й системе исчисления (0,1)
        // !если число выходит за диапазон величин переменной - CE
        int iBinary = 0b1110; //value should be prefix with "0b" or "0B"
        double dBinary = 0B1110;
        float fBinary = 0b1110;
        char cBinary = 0b1110;

        // Форма написания в 8-й системе исчисления (0,1,3,4,5,6,7)
        int iOctal = 010; //value should be prefix with "0"
        double dOctal = 010;
        float fOctal = 010;
        char cOctal = 010;
        byte bOctal = 010;

        // Форма написания в 16-й системе исчисления (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)
        int iHexaDecimal = 0xF0; //value should be prefix with "0x or "0X"
        double dHexaDecimal = 0XFF;
        char cHexadecimal = 0xFF;
        byte bHexadecimal = 0x1;

        //Представление символьного типа с помощью кода Unicode uXXXXX
        char cUnicode = '\u0041'; //A
        char cUnicode2 = '\u0416'; //Ж


        /*Представления числа в различных системах исчисления  с помощью методов(to)*/
        int iToMethod = 239;
        // вывод целого числа в двоичной системе
        System.out.println("Binary: " + Integer.toBinaryString(iToMethod));

        // вывод целого числа в 16-й системе
        System.out.println("Hexademical: " + Integer.toHexString(iToMethod));

        // вывод целого числв в 8-й системе
        System.out.println("Octal: " + Integer.toOctalString(iToMethod));

        // вывод целого числа через универсальный метод т.е. в () сначала указываем какое число, а потом систему перевода
        System.out.println("Universal: " + Integer.toUnsignedString(iToMethod, 5));

        // Получение числа из других систем исчисления (valueOf)
        String octal = "10";
        System.out.println("ValueOfOctal: " + Integer.valueOf(octal, 8));

        String hex = "FF";
        System.out.println("ValueOfHexaDecimal: " + Integer.valueOf(hex, 16));

        String bi = "111110";
        System.out.println("ValueOfBinary: " + Integer.valueOf(bi, 2));

        String d = "123ghj";
        System.out.println(Integer.valueOf(d, 20));


    }
}
