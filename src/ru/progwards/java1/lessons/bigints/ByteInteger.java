package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {
    byte num;

    public ByteInteger(byte num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return Byte.toString(num);
    }

    @Override
    public int toInt(){
        return (int) num;
    }
}
