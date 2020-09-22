package ru.progwards.java1.lessons.bigints;

public class AbsInteger {
    int num;
    public AbsInteger(int num){
        this.num = num;
    }

    static AbsInteger add(AbsInteger num1, AbsInteger num2){
        int sum;
        sum = num1.toInt() + num2.toInt();
        if (sum > Byte.MIN_VALUE && sum < Byte.MAX_VALUE){
            return new ByteInteger((byte) sum);
        }
        else if (sum > Short.MIN_VALUE && sum < Short.MAX_VALUE){
            return new ShortInteger((short) sum);
        }
        else return new AbsInteger(sum);
    }

    public int toInt(){
        return 0;
    }
}
