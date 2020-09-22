package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class AbsInteger {
    BigInteger num;
    public AbsInteger(BigInteger num){
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
        else if (sum > Integer.MIN_VALUE && sum < Integer.MAX_VALUE){
            return new IntInteger(sum);
        }
        else return new AbsInteger(BigInteger.valueOf(sum));
    }

    public int toInt(){
        return 0;
    }

    public static void main(String[] args) {
        IntInteger num1 = new IntInteger( -200000000);
        IntInteger num2 = new IntInteger( 200000000);
        System.out.println(num1.getClass());
        System.out.println(num2.getClass());
        System.out.println(AbsInteger.add(num1, num2));

    }
}
