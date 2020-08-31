package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

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

public class Animal implements FoodCompare, CompareWeight<Animal> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    public double getFood1kgPrice(){
        FoodKind foodKind = getFoodKind();
        switch (foodKind){
            case HAY: return 20d;
            case CORN: return 50d;
            case UNKNOWN: return 0d;
            default: return 0d;
        }
    }

    public double getFoodPrice(){
        return calculateFoodWeight() * getFood1kgPrice();
    }

    @Override
    public int compareFoodPrice(Animal aminal){
        return Double.compare(getFoodPrice(), aminal.getFoodPrice());
    }

    @Override
    public CompareResult compareWeight(Animal smthHasWeigt){
        int result = Double.compare(weight, smthHasWeigt.weight);
        switch (result){
            case -1: return CompareResult.LESS;
            case 1: return CompareResult.GREATER;
            default: return CompareResult.EQUAL;
        }
    }
}
