package com.bcv.lessons.LetterCalculator;

import javafx.scene.media.SubtitleTrack;

import java.util.Scanner;
import java.util.Stack;

public class LetterCountWithoutOOP {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter new value: ");
            String line = scanner.nextLine();

            //PUSH 1
            String[] parts = line.split(" ");
            String cmdName = parts[0].toUpperCase();

            if (cmdName.equals("PUSH")) {
                stack.push(Double.valueOf(parts[1]));
            } else if (cmdName.equals("PRINT")) {
                System.out.println(stack);
            } else if (cmdName.equals("ADD")) {
                double add = stack.pop() + stack.pop();
                stack.push(add);
            } else if (cmdName.equals("DIV")) {
                double div = stack.pop() / stack.pop();
                stack.push(div);
            } else if (cmdName.equals("SUB")) {
                double sub = stack.pop() - stack.pop();
                stack.push(sub);
            } else if (cmdName.equals("MUL")) {
                double mul = stack.pop() * stack.pop();
                stack.push(mul);
            } else if (cmdName.equals("DEFINE")) {
                double a = stack.pop();

            }
        }
    }
}
