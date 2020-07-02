package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;
    public Eratosthenes(int N){
        sieve = new boolean[N];
        Arrays.fill(sieve, true);
        this.sift();
    }

    private void sift(){
        int i, j, N = sieve.length;

        for (i = 2; i < N; i++){
            for (j = 2; j * i < N; j++){
                sieve[i * j] = false;
            }
        }
    }

    public boolean isSimple(int n){
        return sieve[n];
    }

    public static void main(String[] args) {
        int N = 100;
        Eratosthenes array = new Eratosthenes(N);
        for (int i = 2; i < N; i++){
            System.out.println("Число " + i + " проcтое? " + array.isSimple(i));
        }
    }
}
