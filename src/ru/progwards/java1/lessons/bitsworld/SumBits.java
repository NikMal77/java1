package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
        System.out.println(sumBits((byte) 37));
    }

    public static int sumBits(byte value){
        int sum = 0;

        while (value > 0){
            sum += value & 1;
            value = (byte) (value >> 1);
        }
        return sum;
    }
}
