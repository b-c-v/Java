package com.bcv.lessons.LetterCalculator;

import java.util.Stack;

public class Push implements Cmd {
    @Override
    public void exec(String[] parts, Stack<Double> stack) {
        stack.push(Double.valueOf(parts[1]));
    }
}
