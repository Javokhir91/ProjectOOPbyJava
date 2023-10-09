package ru.Rakhmatov.Lesson4.HwLes4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;



    public Box() {
        this.fruits = new ArrayList<>();
    }


    public void addFruits(T fruit){
        fruits.add(fruit);
    }


    public float getWeight() {

        float TotalFruitWeight = 0;

        for (T fruit: fruits) {
            TotalFruitWeight += fruit.getWeight();
        }
        return TotalFruitWeight;
    }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<T> newbox) {
        for (T fruit: fruits) {
            newbox.addFruits(fruit);
        }

        fruits.clear();
    }

    @Override
    public String toString() {
        if (fruits.size() <= 0){
            return  "Box{" + "fruits=" + fruits + ")";
        }
        return "Box{" + "fruits=" + fruits.toString().repeat(3) + ")";
    }
}

