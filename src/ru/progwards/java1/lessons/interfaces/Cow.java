package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Cow extends Animal {
    Cow(double weight){
        super(weight);
    }

    @Override
    public AnimalKind getKind(){
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind(){
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff(){
        return 0.05;
    }

}
