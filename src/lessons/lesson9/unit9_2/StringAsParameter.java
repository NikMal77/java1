package lessons.lesson9.unit9_2;

public class StringAsParameter {
    static void stringAsParam(String str){
        str = "Строка изменена в методе stringAsParam";
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "Строка проинициализирована в main";
        System.out.println(str);
        stringAsParam(str);
        System.out.println(str);
    }
}
