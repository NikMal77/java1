package ru.progwards.java1.lessons.classes;

public class TestComplexNum {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(3,4);
        ComplexNum num2 = new ComplexNum(5,6);
        System.out.println("Исходное значение числа 1: " + num1.toString());
        System.out.println("Исходное значение числа 2: " + num2.toString());

        num1.add(num2);
        System.out.println("Результат сложения чисел 1 и 2: " + num1.toString());

        num1.a = 3;
        num1.b = 4;
        num2.sub(num1);
        System.out.println("Результат вычитания числа 1 из 2: " + num2.toString());

        num2.a = 5;
        num2.b = 6;
        num1.mul(num1);
        System.out.println("Результат умножения числа 1 на 1: " + num1.toString());
        num2.div(num1);
        System.out.println("Результат деления числа 2 на 2: " + num2.toString());

    }
}
