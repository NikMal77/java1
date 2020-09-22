package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class ShortInteger extends AbsInteger {
    short num;

    public ShortInteger(short num) {
        super(BigInteger.valueOf(num));
        this.num = num;
    }

    @Override
    public String toString(){
        return Short.toString(num);
    }

    @Override
    public int toInt(){
        return (int) num;
    }
}
