package ru.progwards.java1.lessons.classes;
enum AnimalKind{
    ANIMAL,
    COW,
    HAMSTER,
    DUCK
}
enum FoodKind{
    UNKNOWN,
    HAY,
    CORN
}
public class Animal {
    double weight;

    public Animal(double weight){
        this.weight = weight;
    }

    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }

    @Override
    public String toString(){
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public double getWeight(){
        return weight;
    }

    public double getFoodCoeff(){
        return 0.02;
    }

    public double calculateFoodWeight(){
        return getWeight() * getFoodCoeff();
    }

    public String toStringFull(){
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }
}
