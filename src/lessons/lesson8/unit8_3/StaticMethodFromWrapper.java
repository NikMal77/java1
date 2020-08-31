package lessons.lesson8.unit8_3;

public class StaticMethodFromWrapper {
    public static void main(String[] args) {
        double a = 1.2345;
        double b = 5.4321;

        Double objA = 55.555;

        double maxAB = objA.max(a, b);
        System.out.println("compareAB = " + maxAB);

        // правильнее использовать имя класса, а не имя объекта
        maxAB = Double.max(a, b);
        System.out.println("compareAB = " + maxAB);

    }
}
