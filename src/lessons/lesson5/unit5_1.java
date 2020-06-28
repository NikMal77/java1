package lessons.lesson5;

public class unit5_1 {
    public static void main(String[] args) {
        Person Ivan = new Person("Иван", 40);
        System.out.println("Имя: " + Ivan.getName());
        System.out.println("Возраст: " + Ivan.getAge());
        System.out.println("Страна: " + Ivan.getCountry());
    }
}

class Person{
    private String name;
    private int age;
    private String country;

    public Person(){
        country = "RU";
    }

    public Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }
}
