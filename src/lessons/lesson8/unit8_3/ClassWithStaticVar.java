package lessons.lesson8.unit8_3;

public class ClassWithStaticVar {
    static String staticString;

    public static void main(String[] args) {
        ClassWithStaticVar a = new ClassWithStaticVar();
        a.staticString = "Переменная я статическая, и хранюсь в одном месте, фактически.";
        System.out.println(a.staticString);

        ClassWithStaticVar b = new ClassWithStaticVar();
        b.staticString = "В одном месте? Что ж - доверяем, но, для верности, проверяем.";
        System.out.println(a.staticString);

        // правильнее использовать имя класса, а не объекты, созданные на основе класса
        ClassWithStaticVar.staticString = "Статическая переменная будет одна для всех объектов этого класса.";
        System.out.println();
        System.out.println(ClassWithStaticVar.staticString);
        System.out.println(a.staticString);
        System.out.println(b.staticString);

    }
}
