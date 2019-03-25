package com.bcv.lessons.LetterCalculator;

import java.util.*;

public class LetterCountOOP {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        Map<String, Cmd> comandsMap = new HashMap<>();
        comandsMap.put("PUSH", new Push());
        comandsMap.put("PRINT", new Print());
        comandsMap.put("ADD", new Add());
        comandsMap.put("DIV", new Div());
        comandsMap.put("MUL", new Mul());
        comandsMap.put("SUB", new Sub());

        while (true) {
            System.out.println("Enter new value: ");
            String line = scanner.nextLine();

            //разбиваем введенную строку по пробелу и добавляем в массив. Например: push 1 -> String [] parts = {push, 1};
            String[] parts = line.split(" ");

            String cmdName = parts[0].toUpperCase();

           /*Cmd s = comandsMap.get(cmdName);
           s.exec(parts,stack);
           код ниже является сокращенной формой записи данного кода. Сначала получаем значение, которое соответсвует данном ключу.
           После чего к данному значению применяем метод exec соответствующий данному значению.
           Например: push 1 -> Push.exec(parts, stack) или add -> Add.exec(parts, stack)
           */

            comandsMap.get(cmdName).exec(parts, stack);
        }
    }
}