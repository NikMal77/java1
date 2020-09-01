package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight<T> {

    public enum CompareResult{
        LESS,
        EQUAL,
        GREATER
    }

    CompareResult compareWeight(T smthHasWeigt);

}
