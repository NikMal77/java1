package lessons.lesson6.unit6_3;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int[] arrayInt1 = {1, 2, 3, 4, 5};
        int[] arrayInt2 = {5, 4, 3, 2, 1};
        int[] arrayInt3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.equals(arrayInt1, arrayInt2));
        System.out.println(Arrays.equals(arrayInt1, arrayInt3));
    }
}
