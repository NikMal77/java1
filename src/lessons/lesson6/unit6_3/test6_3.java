package lessons.lesson6.unit6_3;

import java.util.Arrays;

public class test6_3 {
    public static void main(String[] args) {
        int[] a1 = {1, 1, 1, 1, 3};
        int[] a2 = new int[5];
        Arrays.fill(a2, 1);
        a2[4] = 3;
        System.out.println(Arrays.equals(a1, a2));

    }

    public int arrayMax(int[] a){
        if (a.length == 0) return 0;
        Arrays.sort(a);
        return a[a.length - 1];
//        int max = a[0];
//        for (int i = 0; i < a.length; i++){
//            if (a[i] > max){
//                max = a[i];
//            }
//        }
//        return max;
    }
}
