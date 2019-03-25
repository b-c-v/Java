package com.bcv.lessons.LetterCalculator;

import java.util.Stack;

public class Mul implements Cmd {

    @Override
    public void exec(String[] parts, Stack<Double> stack) {
        double mul = stack.pop() * stack.pop();
        stack.push(mul);
    }
}
