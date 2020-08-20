package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private byte num;

    public static void main(String[] args) {
        Binary binary = new Binary((byte) -1);
        System.out.println(binary.toString());
    }

    public Binary(byte num){
        this.num = num;
    }
    public String toString(){
        String result = "";
        byte numS = num;

        for (int i = 0; i < 8; i++) {
            result = (numS & 1) + result;
            numS = (byte) (numS >> 1);
        }

        return result;
    }
}
