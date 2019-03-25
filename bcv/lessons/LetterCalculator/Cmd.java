package com.bcv.lessons.LetterCalculator;

import java.util.Stack;

public interface Cmd {
    void exec(String[] parts, Stack<Double> stack);
}
