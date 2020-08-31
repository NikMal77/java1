package lessons.lesson8.unit8_2;

public class Test8_2 {
    public interface Speaking {
        public String say();
    }

    public interface Eating {
        public String eat();
    }

    public class Dog implements Speaking, Eating{
        @Override
        public String say(){
            return "Гав";
        }

        @Override
        public String eat(){
            return "Мясо";
        }

    }

    public class Goat implements Speaking, Eating{
        @Override
        public String say(){
            return "Мее";
        }

        @Override
        public String eat(){
            return "Сено";
        }

    }
}
