package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
    }
    public static int reverseDigits(int number){
        return number = 100 * (number % 10) + 10 * (number / 10 % 10) + number / 100;
    }
}
