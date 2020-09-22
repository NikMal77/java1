package lessons.lesson9.unit9_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalInMinute {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("12345.54321");
        BigDecimal bigDecimalInt = new BigDecimal("12345");
        BigDecimal bigDecimalFrac = new BigDecimal(".54321");
        System.out.println("bigDecimal = " + bigDecimal);

        BigDecimal result1 = bigDecimal.subtract(bigDecimalFrac); // вычитание
        BigDecimal result2 = bigDecimal.subtract(bigDecimalInt);  // вычитание
        BigDecimal result3 = result1.add(result2); // сложение

        System.out.println("resultl = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        System.out.println("result3 * 10 = " + result3.multiply(BigDecimal.TEN));
        System.out.println("result3 / 10 = " + result3.divide(BigDecimal.TEN));
        System.out.println("result3 / 10 = " + result3.divide(new BigDecimal(17), RoundingMode.HALF_UP));
    }
}
