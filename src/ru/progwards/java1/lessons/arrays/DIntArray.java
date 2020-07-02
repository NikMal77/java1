package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] a;

    public DIntArray(){

    }

    public void add(int num){
        int[] aCopy = Arrays.copyOf(a, a.length + 1);
        aCopy[aCopy.length - 1] = num;
        a = aCopy;
    }

    public void atInsert(int pos, int num){
        int[] aCopy = Arrays.copyOf(a, a.length + 1);
        for (int i = aCopy.length - 1; i > pos; i--){
            aCopy[i] = aCopy[i - 1];
        }
        aCopy[pos] = num;
        a = aCopy;
    }

    public void atDelete(int pos){
        for (int i = pos; i < a.length - 1; i++){
            a[i] = a[i + 1];
        }
        int[] aCopy = Arrays.copyOf(a, a.length - 1);
        a = aCopy;
    }

    public int at(int pos){
        return a[pos];
    }


    public static void main(String[] args) {
        int i = 0;
        int[] array = {1, 2};
        DIntArray a = new DIntArray();

        System.out.println("Добавили элемент");
        a.add(5);
        for (i = 0; i < 3; i++){
            System.out.println("Элемент " + i + " имеет значение " + a.at(i));
        }
        System.out.println();

        System.out.println("Изменили элемент");
        a.atInsert(1, 3);
        for (i = 0; i < 4; i++){
            System.out.println("Элемент " + i + " имеет значение " + a.at(i));
        }
        System.out.println();

        System.out.println("Удалили элемент");
        a.atDelete(2);
        for (i = 0; i < 3; i++){
            System.out.println("Элемент " + i + " имеет значение " + a.at(i));
        }

    }
}
