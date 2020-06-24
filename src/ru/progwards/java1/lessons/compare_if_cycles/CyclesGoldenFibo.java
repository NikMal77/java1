package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
        boolean result = false;
        while (number > 0){
            if(number % 10 == digit){
                result = true;
                break;
            }
            number /= 10;
        }
        return result;
    }
    public static int fiboNumber(int n){
        int sum0 = 0;
        int sum1 = 1;
        int sum = 1;

        for (int i = 1; i < n; i++){
            sum = sum0 + sum1;
            sum0 = sum1;
            sum1 = sum;
        }
        if (n > 0) return sum;
        else return 0;
    }
    public static boolean isGoldenTriangle(int a, int b, int c){
        boolean result = false;
        double ratio = 0.0;
        if(a == b) ratio = (double) a / c;
        else if (a == c) ratio = (double) a / b;
        else if (b == c) ratio = (double) b / a;
        else return result;

        if (ratio >= 1.61703 && ratio <= 1.61903) result = true;
        return result;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++){
            System.out.print(fiboNumber(i) + ", ");
        }
        System.out.println();
        for (int i = 1; i <= 100; i++){
            for (int j = 3; j <= 100; j++){
                if((i + i > j) && isGoldenTriangle(i, i, j))
                    System.out.println("Золтой треугольник имеет соотношение: " + j + ", " + i + ", " + i + ".");
            }
        }
    }
}
