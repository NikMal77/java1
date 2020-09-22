package lessons.lesson9.unit9_3;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalRound {
    public static void main(String[] args) {
        BigDecimal bigDec1 = new BigDecimal("9876.54321");
        System.out.println("bigDec1 = " + bigDec1);
        System.out.println("unscaledValue = " + bigDec1.unscaledValue());
        System.out.println("scale = " + bigDec1.scale() + "\n");

        MathContext mathContext = new MathContext(5);
        BigDecimal bigDec2 = new BigDecimal("9876.54321", mathContext);
        System.out.println("bigDec2 = " + bigDec2);
        System.out.println("unscaledValue = " + bigDec2.unscaledValue());
        System.out.println("scale = " + bigDec2.scale() + "\n");

        BigDecimal result = bigDec2.round(new MathContext(4));
        System.out.println("result = " + result);
        System.out.println("unscaledValue = " + result.unscaledValue());
        System.out.println("scale = " + result.scale());
    }
}
