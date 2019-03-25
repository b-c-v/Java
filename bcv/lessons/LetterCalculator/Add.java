package com.bcv.lessons.LetterCalculator;

import java.util.Stack;

public class Add implements Cmd{
    @Override
    public void exec(String[] parts, Stack<Double> stack) {
        double add = stack.pop() + stack.pop();
        stack.push(add);
    }
}
