package lessons.lesson4;

public class unit4_1{
    public static void main(String[] args) {
        System.out.println(addAsStrings(1, 2));
    }
    static int addAsStrings(int n1, int n2){
        String s = Integer.toString(n1) + Integer.toString(n2);
        return Integer.parseInt(s);

    }
}

