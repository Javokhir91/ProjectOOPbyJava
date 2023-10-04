package ru.geekbrains.lesson3.Animals;

public class Cat extends Animal {

    public static int counter;

    static {
        counter++;
    }

    protected static int getCounter(){
        return counter;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
}
