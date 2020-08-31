package lessons.lesson8.unit8_3;

public class StaticConstructor {
    static String staticString = "Значение присвоено при описании переменной";
    static {
        staticString = "Значение присвоено в статическом коснтрукторе класса";
    }

    public static void main(String[] args) {
        System.out.println(StaticConstructor.staticString);
    }
}
