package lessons.lesson8.unit8_1;

public class HashCode {
    public static void main(String[] args) {
        System.out.println("Хешкоды от new Object():");
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println("Хешкоды от new Integer(5):"); // Хешкод совпадает с значением числа
        System.out.println(new Integer(5).hashCode());
        System.out.println(new Integer(5).hashCode());
        System.out.println(new Integer(5).hashCode());
        System.out.println("Хешкоды от new String(\"Строка\"):"); // Хешкод во всех трех случаях имеет одно значение
        System.out.println(new String("Строка").hashCode());
        System.out.println(new String("Строка").hashCode());
        System.out.println(new String("Строка").hashCode());
    }
}
