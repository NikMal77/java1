package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    short num;

    public ShortInteger(short num) {
        super(num);
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
