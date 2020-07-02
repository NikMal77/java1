package lessons.lesson6.unit6_3;

import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args) {
        int[] arrayInt = {-7, 5, 0, 58, -1};
        int[] arrayIntCopy = Arrays.copyOf(arrayInt, arrayInt.length);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        //arrayInt[0] = 55555;
        Arrays.sort(arrayIntCopy);
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
        System.out.println(arrayInt.equals(arrayIntCopy));
    }
}
