package com.bcv.lessons.LetterCalculator;

import java.util.Stack;

public class Div implements Cmd {

    @Override
    public void exec(String[] parts, Stack<Double> stack) {
        double div = stack.pop() / stack.pop();
        stack.push(div);
    }
}
