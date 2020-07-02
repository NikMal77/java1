package lessons.lesson6.unit6_1;

public class CheckFiboRuleTwo {
    private static boolean checkFibo(int[] intArray){
        for (int i = 2; i < intArray.length; i++){
            if (intArray[i - 2] + intArray[i - 1] != intArray[i])
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        int[] simpleArray1 = {21, 34, 55, 89, 144};
        int simpleArray2[] = {144, 34, 55, 89, 21};
        int[] simpleArray3 = new int[5];

        int[] [] intArray2D = {simpleArray1, simpleArray2, simpleArray3};

        System.out.println("intArray2D.length = " + intArray2D.length);

        for (int i = 0; i < intArray2D.length; i++) {
            System.out.println("checkFibo = " + i + " = " + checkFibo(intArray2D[i]));
        }
    }
}


