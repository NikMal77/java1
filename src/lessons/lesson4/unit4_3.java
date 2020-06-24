package lessons.lesson4;

public class unit4_3 {
    public static void main(String[] args) {
        System.out.println(facrorial(5));
    }
    static long facrorial(long n){
        n = n < 0 ? -n: n;
        long f = 1;
        if (n > 0){
            for (int i = 1; i <= n; i++){
                f *= i;
            }
        }
        return f;
    }
}
