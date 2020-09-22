package lessons.lesson9.unit9_3;

import java.math.BigDecimal;

public class BigDecimalExample1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1234.56789");
        System.out.println("bigDecimal = " + bigDecimal);
        System.out.println("unscaledValue = " + bigDecimal.unscaledValue());
        System.out.println("scale = " + bigDecimal.scale());
    }
}
