package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class ByteInteger extends AbsInteger {
    byte num;

    public ByteInteger(byte num) {
        super(BigInteger.valueOf(num));
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
