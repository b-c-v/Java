package com.bcv.lessons.LetterCalculator;

import java.util.Stack;

public class Print implements Cmd {
    @Override
    public void exec(String[] parts, Stack<Double> stack) {
        System.out.println(stack);
    }
}