package ru.Rakhmatov.Lesson4;

public class MyArrayList<T> {

    private T[] array;
    private int currentIndex = -1;

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public int size(){
        return currentIndex + 1;
    }

    public void add(T value){
        if (currentIndex + 1 < array.length) {
            array[++currentIndex] = value;
        }

    }

}
