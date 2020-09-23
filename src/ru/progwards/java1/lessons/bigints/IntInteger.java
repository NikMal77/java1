package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger{
    int num;

    public IntInteger(int num) {
        super(num);
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
