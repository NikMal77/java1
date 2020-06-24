package lessons.lesson4;

public class CycleWhile2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            i++;
            if (i == 3){
                System.out.println("Сработал continue ...");
                continue;
            }
            System.out.println("Строка " + i);
        }
    }
}
