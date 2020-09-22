package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class IntInteger extends AbsInteger{
    int num;

    public IntInteger(int num) {
        super(BigInteger.valueOf(num));
        this.num = num;
    }

    @Override
    public String toString(){
        return Integer.toString(num);
    }

    @Override
    public int toInt(){
        return (int) num;
    }


}
