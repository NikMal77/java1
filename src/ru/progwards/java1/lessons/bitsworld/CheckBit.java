package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
        System.out.println(checkBit((byte) 0b0100101, 2));
    }

    public static int checkBit(byte value, int bitNumber){
        int bitValue = 0;
        value = (byte) (value >> bitNumber);
        bitValue = value & 1;

        return bitValue;
    }
}
