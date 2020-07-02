package lessons.lesson6.unit6_1;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] simpleArray1 = {21, 34, 55, 88, 144};
        int simpleArray2[] = {144, 34, 55, 89, 21};
        int[] simpleArray3 = new int[5];

        String[] stringArray1 = new String[5];
        String[] stringArray2 = {"мне", "всё", "понятно"};

        System.out.println("Значения отдельных элементов массива");
        System.out.println("simpleArray1[2] = " + simpleArray1[2]);
        System.out.println("simpleArray2[0] = " + simpleArray2[0]);
        boolean testFibo = simpleArray1[0] + simpleArray1[1] == simpleArray1[2];
        System.out.println("testFibo = " + testFibo);
        System.out.println("simpleArray3[1] = " + simpleArray3[1]);
        System.out.println("stringArray1[3] = " + stringArray1[3]);
        System.out.println("stringArray2[2] = " + stringArray2[2]);

        System.out.println("\nДлина массива");
        System.out.println("simpleArray1.length = " + simpleArray1.length);
        System.out.println("stringArray1.length = " + stringArray1.length);
        System.out.println("stringArray2.length = " + stringArray2.length);

        System.out.println("\nЦикл for - классическое исполнение");
        printArray(simpleArray1);
        printArray(simpleArray2);
        printArray(simpleArray3);

        System.out.println("Цикл for - упрощенный вариант");
        printArrayTwo(simpleArray1);
        printArrayTwo(simpleArray2);
        printArrayTwo(simpleArray3);
    }

    private static void printArray(int[] intArray){
        for (int i = 0; i < intArray.length; i++){
            System.out.println("Элемент номер " + i + " = " + intArray[i]);
        }
        System.out.println();
    }

    private static void printArrayTwo(int[] intArray){
        for (int value : intArray){
            System.out.println("Элемент " + value);
        }
        System.out.println();
    }
}
