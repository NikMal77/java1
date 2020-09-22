package lessons.lesson9.unit9_2;

public class PrimAsParam {
    static void primAsParam(int i){
        i = 555;
        System.out.println("primAsParam i = " + i);
    }

    public static void main(String[] args) {
        int i = 999;
        System.out.println("main before i = " + i);
        // Переменная передается по значению, поэтому после вызова функции не меняется
        primAsParam(i);
        System.out.println("main after i = " + i);
    }
}
