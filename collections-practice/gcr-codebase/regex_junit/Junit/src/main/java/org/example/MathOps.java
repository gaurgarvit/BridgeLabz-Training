package org.example;

public class MathOps {
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Zero division not allowed");
        return a / b;
    }
}