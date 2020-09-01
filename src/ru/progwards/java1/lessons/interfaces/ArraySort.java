package ru.progwards.java1.lessons.interfaces;

public class ArraySort {

    public static void sort(CompareWeight[] a){
        int i, j, N = a.length;
        CompareWeight t;
        for (i = 0; i < N - 1; i++){
            for (j = i + 1; j < N; j++){
                if (a[i].compareWeight(a[j]) == CompareWeight.CompareResult.GREATER){
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
     }

    public static void main(String[] args) {

        CompareWeight[] a = {new Food(56), new Food(-5), new Food(36)};

        sort(a);
    }
}
