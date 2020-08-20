package lessons.lesson7;

public class test2 {
    public static void main(String[] args) {
        byte value = 0b0011;
        System.out.println(test(value));

    }

    static int test(byte value){
        int result = 0b1;
        return result = result & value;
    }
}
