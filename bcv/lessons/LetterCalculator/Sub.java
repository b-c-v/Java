package com.bcv.lessons.LetterCalculator;

import java.util.Stack;

public class Sub implements Cmd {
    @Override
    public void exec(String[] parts, Stack<Double> stack) {
        double sub = stack.pop() - stack.pop();
        stack.push(sub);
    }
}
