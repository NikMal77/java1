package lessons.lesson9.unit9_3;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalCompareTo {
    public static void main(String[] args) {
//        BigDecimal bigDec1 = new BigDecimal("1234.567890000");
//        System.out.println("bigDec1 = " + bigDec1);
//        System.out.println("unscaledValue = " + bigDec1.unscaledValue());
//        System.out.println("scale = " + bigDec1.scale() + "\n");
//
//        BigDecimal bigDec2 = new BigDecimal("1234.56789");
//        System.out.println("bigDec2 = " + bigDec2);
//        System.out.println("unscaledValue = " + bigDec2.unscaledValue());
//        System.out.println("scale = " + bigDec2.scale() + "\n");
//
//        System.out.println("bigDec1.compareTo(bigDec2): " + bigDec1.compareTo(bigDec2));

        BigDecimal bigDec1 = BigDecimal.valueOf(10);
        BigDecimal bigDec2 = BigDecimal.valueOf(3);
        BigDecimal result = bigDec1.divide(bigDec2, 5, RoundingMode.HALF_UP);
        System.out.println(result);
    }
}
