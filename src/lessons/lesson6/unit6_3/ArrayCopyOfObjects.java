package lessons.lesson6.unit6_3;

import java.util.Arrays;

public class ArrayCopyOfObjects {
    public static void main(String[] args) {
        Integer[] arrayInt = {-7, 5, 0, 58, -1};
        Integer[] arrayIntCopy = Arrays.copyOf(arrayInt, arrayInt.length);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0] = 55555;
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}
