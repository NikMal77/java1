package ru.progwards.java1.lessons.interfaces;

public class TestAnimal {
    public static void InfoAnimal(Animal animal){
        System.out.println(animal.toString());
        System.out.println("Вес: " + animal.weight);
        System.out.println(animal.toStringFull());
        System.out.println();
    }
    public static void main(String[] args) {
        Animal animal = new Animal(60.0);
        InfoAnimal(animal);

        Cow cow1 = new Cow(75.0);
        InfoAnimal(cow1);

        Hamster hamster1 = new Hamster(3.0);
        InfoAnimal(hamster1);

        Duck duck = new Duck(5.0);
        InfoAnimal(duck);

        Hamster hamster2 = new Hamster(75.0);
        System.out.println(cow1.equals(hamster2));

        Cow cow2 = new Cow(80.0);
        System.out.println(cow1.equals(cow2));

        Cow cow3 = new Cow(75.0);
        System.out.println(cow1.equals(cow3));

        System.out.println("Цена еды для животного: " + animal.getFoodPrice());
        System.out.println("Цена еды для коровы: " + cow1.getFoodPrice());
        System.out.println("Цена еды для хомяка: " + hamster1.getFoodPrice());
        System.out.println("Цена еды для утки: " + duck.getFoodPrice());

        System.out.println("Результат сравнения по цене cow1 и cow3: " + cow1.compareFoodPrice(cow3));
        System.out.println("Результат сравнения по цене cow1 и cow2: " + cow1.compareFoodPrice(cow2));
        System.out.println("Результат сравнения по цене cow1 и hamster1: " + cow1.compareFoodPrice(hamster1));
        System.out.println("Результат сравнения по цене hamster1 и duck: " + hamster1.compareFoodPrice(duck));

        System.out.println("Результат сравнения по весу cow1 и cow2: " + cow1.compareWeight(cow2));
        System.out.println("Результат сравнения по весу cow1 и cow3: " + cow1.compareWeight(cow3));
        System.out.println("Результат сравнения по весу cow1 и hamster1: " + cow1.compareWeight(hamster1));
        System.out.println();

        Food food1 = new Food(1);
        Food food2 = new Food(2);
        Food food3 = new Food(1);

        System.out.println("Результат сравнения по весу food1 и food2: " + food1.compareWeight(food2));
        System.out.println("Результат сравнения по весу food1 и food3: " + food1.compareWeight(food3));
        System.out.println("Результат сравнения по весу food2 и food3: " + food2.compareWeight(food3));
    }

}
