package ru.progwards.java1.lessons.interfaces;

import java.math.BigInteger;

public class CalculateFibonacci {
    private static CacheInfo lastFibo = new CacheInfo();

    public static int fiboNumber(int n){
        if (lastFibo == null) return 0;
        if (n == lastFibo.n) return lastFibo.fibo;
        else {
            if (n > 0) {
                int sum0 = 0;
                int sum1 = 1;
                int sum = 1;

                for (int i = 1; i < n; i++) {
                    sum = sum0 + sum1;
                    sum0 = sum1;
                    sum1 = sum;
                }

                lastFibo.n = n;
                lastFibo.fibo = sum;
                return sum;
            } else return 0;
        }
    }

    public static class CacheInfo{
        public int n = 0;
        public int fibo = 0;
    }

    public static CacheInfo getLastFibo(){
        return lastFibo;
    }

    public static void clearLastFibo(){
        lastFibo = null;
    }

    public static void main(String[] args) {
        System.out.println("Последнее значение n: " + getLastFibo().n);
        System.out.println("Последнее значение fibo: " + getLastFibo().fibo);

        System.out.println("Новое значение fibo: " + CalculateFibonacci.fiboNumber(10));
        System.out.println("Последнее значение n: " + getLastFibo().n);
        System.out.println("Последнее значение fibo: " + getLastFibo().fibo);

        System.out.println("Новое значение fibo: " + CalculateFibonacci.fiboNumber(15));
        System.out.println("Последнее значение n: " + getLastFibo().n);
        System.out.println("Последнее значение fibo: " + getLastFibo().fibo);

        int fibo;
        fibo = CalculateFibonacci.fiboNumber(15);
        fibo = CalculateFibonacci.fiboNumber(16);





     }
}
