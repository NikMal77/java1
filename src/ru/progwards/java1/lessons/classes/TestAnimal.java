package ru.progwards.java1.lessons.classes;

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

        Cow cow = new Cow(75.0);
        InfoAnimal(cow);

        Hamster hamster = new Hamster(3.0);
        InfoAnimal(hamster);

        Duck duck = new Duck(5.0);
        InfoAnimal(duck);
    }

}
