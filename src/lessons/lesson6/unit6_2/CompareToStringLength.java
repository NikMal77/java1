package lessons.lesson6.unit6_2;

public class CompareToStringLength {
    public static void main(String[] args) {
        String str1 = "12345";

        System.out.println(str1.compareTo(""));
        System.out.println("".compareTo(str1));

        System.out.println(str1.length());
    }
}
