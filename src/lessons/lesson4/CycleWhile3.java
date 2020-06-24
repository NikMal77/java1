package lessons.lesson4;

public class CycleWhile3 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            i++;
            if (i == 3){
                System.out.println("Сработал break ...");
                break;
            }
            System.out.println("Строка " + i);
        }
    }
}
