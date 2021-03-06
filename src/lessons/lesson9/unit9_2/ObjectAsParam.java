package lessons.lesson9.unit9_2;

public class ObjectAsParam {
    static class Simple{
        int a = 0;
        boolean b = false;
        String msg = "Это класс Simple";

        @Override
        public String toString(){
            return "Simple{" +
                    "a=" + a +
                    ", b=" + b +
                    ", msg='" + msg + '\'' + '}';
        }
    }

    static void objectAsParam(Simple simple){
        simple.a = 55555;
        simple.b = true;
        simple.msg = "Сообщение изменено в objectAsParam";
    }

    public static void main(String[] args) {
        Simple simple = new Simple();

        System.out.println(simple);
        objectAsParam(simple);
        System.out.println(simple);
    }
}
