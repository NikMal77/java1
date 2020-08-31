package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight<Food>{
    private int weight;

    Food(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public CompareResult compareWeight(Food smthHasWeigt){
        int result = Integer.compare(weight, smthHasWeigt.getWeight());
        switch (result){
            case -1: return CompareResult.LESS;
            case 1: return CompareResult.GREATER;
            default: return CompareResult.EQUAL;
        }
    }
}
