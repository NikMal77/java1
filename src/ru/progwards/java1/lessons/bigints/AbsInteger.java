package ru.progwards.java1.lessons.bigints;

public class AbsInteger {
    int num;
    public AbsInteger(int num){
        this.num = num;
    }

    static AbsInteger add(AbsInteger num1, AbsInteger num2){
        int sum;
        sum = num1.toInt() + num2.toInt();
        if (sum >= Byte.MIN_VALUE && sum <= Byte.MAX_VALUE){
            return new ByteInteger((byte) sum);
        }
        else if (sum >= Short.MIN_VALUE && sum <= Short.MAX_VALUE){
            return new ShortInteger((short) sum);
        }
        else if (sum >= Integer.MIN_VALUE && sum <= Integer.MAX_VALUE){
            return new IntInteger(sum);
        }
        else return new AbsInteger(sum);
    }

    public int toInt(){
        return num;
    }

    public static void main(String[] args) {
        ByteInteger num1 = new ByteInteger((byte) -64);
        ShortInteger num2 = new ShortInteger((short) 30000);
        IntInteger num3 = new IntInteger( 200000000);

        AbsInteger num4 = AbsInteger.add(num1, num1);
        AbsInteger num5 = AbsInteger.add(num1, num2);
        AbsInteger num6 = AbsInteger.add(num2, num3);

        System.out.println(num4.getClass() + " \t" + num4.toString());
        System.out.println(num5.getClass() + " \t" + num5.toString());
        System.out.println(num6.getClass() + " \t" + num6.toString());

    }
}
