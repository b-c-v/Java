package com.bcv.lessons.exceptions;

import java.io.IOException;

//throw
public class ExceptionSample {
    public static void main(String[] args) {
        throw new IndexOutOfBoundsException();
    }
    public void ex() throws IOException {
        throw new IOException();
    }
}
