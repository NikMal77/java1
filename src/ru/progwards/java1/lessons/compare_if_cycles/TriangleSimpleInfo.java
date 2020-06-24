package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        int max;
        if(a >= b)
            max = a;
        else
            max = b;
        if(c > max)
            max = c;
        return max;
    }
    public static int minSide(int a, int b, int c){
        int min;
        if (a <= b)
            min = a;
        else
            min = b;
        if (c < min)
            min = c;
        return min;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        if (a == b && a == c && b == c)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("Максимум " + maxSide(6, 5, 4));
        System.out.println("Минимум " + minSide(6, 5, 4));
        System.out.println(isEquilateralTriangle(5, 6, 6));
    }
}
