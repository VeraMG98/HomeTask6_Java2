package com.company;

public class Main {

    public static void main(String[] args) {
        MyClass<Double> valueFirst = new MyClass<>(2.0,5.0);
        valueFirst.calculate("+");
        valueFirst.calculate("-");

        MyClass<Integer> valueSecond = new MyClass<>(5,3);
        valueFirst.calculate("*");
        valueFirst.calculate("/");
    }
}

