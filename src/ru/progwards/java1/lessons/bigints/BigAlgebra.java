package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {
    public static BigDecimal fastPow(BigDecimal num, int pow){
        if (pow == 0) return BigDecimal.ONE;
        String bitPow = Integer.toBinaryString(pow);
        BigDecimal res = BigDecimal.ONE;
        BigDecimal pr;

        for (int i = 0; i < bitPow.length() - 1; i++){
            if (bitPow.charAt(i) == '1') {
                pr = res.multiply(num);
                res = pr.multiply(pr);
            }
            else res = res.multiply(res);
        }

        if (bitPow.charAt(bitPow.length() - 1) == '1') res = res.multiply(num);
        return res;
    }

    public static BigInteger fibonacci(int n){
        BigInteger sum0 = BigInteger.ZERO;
        BigInteger sum1 = BigInteger.ONE;
        BigInteger sum = BigInteger.ONE;

        for (int i = 1; i < n; i++){
            sum = sum0.add(sum1);
            sum0 = sum1;
            sum1 = sum;
        }
        if (n > 0) return sum;
        else return sum0;
    }

    public static void main(String[] args) {
        System.out.println(fastPow(new BigDecimal("21"), 13));
        for (int i = 1; i <= 10; i++) System.out.println(fastPow(BigDecimal.TEN, i));

        for (int i = 1; i <= 10; i++) System.out.println(fibonacci(i));
    }
}
