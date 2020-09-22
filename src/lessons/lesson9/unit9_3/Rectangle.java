package lessons.lesson9.unit9_3;

import java.math.BigDecimal;

public class Rectangle {
    Rectangle(BigDecimal a, BigDecimal b) {
        this.a = a;
        this.b = b;
    }
    public BigDecimal a;
    public BigDecimal b;

    static boolean rectCompare(Rectangle r1, Rectangle r2){
        boolean result = false;
        BigDecimal s1 = r1.a.multiply(r1.b);
        BigDecimal s2 = r2.a.multiply(r2.b);

        if (s1.compareTo(s2) == 0) result = true;

        return result;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new BigDecimal("25"), new BigDecimal("20"));
        Rectangle r2 = new Rectangle(new BigDecimal("25"), new BigDecimal("25"));

        System.out.println(rectCompare(r1, r2));
    }
}
