package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] a){
        int i, j, t, N = a.length;
        for (i = 0; i < N - 1; i++){
            for (j = i + 1; j < N; j++){
                if (a[i] > a[j]){
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
     }

    public static void main(String[] args) {
        int[] a = {56, -5, 36, -87, 100, 0, -2, 4, -78, 15};

        sort(a);
        System.out.println(Arrays.toString(a));

    }
}
