package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class ArrayInteger {
    byte[] digits;

    public ArrayInteger(int n) {
        digits = new byte[n];
        //digits = new byte[String.valueOf(Math.abs(n)).length()];
    }

    void fromInt(BigInteger value){
        for (int i = 0; value.compareTo(BigInteger.ZERO) == 1; i++ ){
            digits[i] = value.remainder(BigInteger.TEN).byteValueExact();
            value = value.divide(BigInteger.TEN);
        }
    }

    BigInteger toInt(){
        String str = "";

        for (int i = digits.length - 1; i >= 0; i--){
            str += digits[i];
        }
        return new BigInteger(str);
    }

    boolean add(ArrayInteger num){
        byte sum, r = 0;
        if (digits.length < num.digits.length) return this.isFalse();

        for (int i = 0; i < num.digits.length ; i++){
            sum = (byte) (digits[i] + num.digits[i] + r);
            if (sum < 10) {
                digits[i] = sum;
                r = 0;
            }
            else {
                if (i == digits.length - 1) return this.isFalse();

                digits[i] = (byte) (sum - 10);
                r = 1;

                if (i == num.digits.length - 1){
                    for (int j = i + 1; j < digits.length ; j++){
                        sum = (byte) (digits[j] + r);
                        if (sum < 10) {
                            digits[j] = sum;
                            r = 0;
                        }
                        else {
                            if (j == digits.length - 1) return this.isFalse();

                            digits[j] = (byte) (sum - 10);
                            r = 1;
                        }
                    }
                }
            }
        }
        return true;
    }

    boolean isFalse(){
        for (int i = 0; i < digits.length; i++) digits[i] = 0;
        return false;
    }


    public static void main(String[] args) {
        ArrayInteger a = new ArrayInteger(10);
        ArrayInteger b = new ArrayInteger(20);
        a.fromInt(new BigInteger("1234567890"));
        b.fromInt(new BigInteger("12345678901234567890"));

        for (byte i : a.digits)
            System.out.println(i);

        System.out.println(a.toInt());
        System.out.println(a.add(b));
        for (byte i : a.digits)
            System.out.println(i);

        a.fromInt(new BigInteger("1234567890"));
        System.out.println(b.add(a) + " " + b.toInt());
        System.out.println();

        a.fromInt(new BigInteger("9999999999"));
        b.fromInt(new BigInteger("12345678901234567890"));
        System.out.println(b.add(a) + " " + b.toInt());
        System.out.println();

    }
}
