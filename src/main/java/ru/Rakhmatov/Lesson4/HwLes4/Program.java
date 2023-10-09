package ru.Rakhmatov.Lesson4.HwLes4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

//        Apple apple = new Apple();
//        Apple apple2 = new Apple();
//        Apple apple3 = new Apple();
//        Orange orange = new Orange();
//        Orange orange2 = new Orange();

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruits(new Apple(3));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruits(new Orange(2));

//        appleBox.addFruits(apple);
//        appleBox.addFruits(apple2);
//        appleBox.addFruits(apple3);
//        orangeBox.addFruits(orange);
//        orangeBox.addFruits(orange2);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> appleNewBox = new Box<>();

        appleBox.transfer(appleNewBox);


        System.out.println(appleNewBox);
        System.out.println(appleBox);

//        appleBox.addFruits(apple);
//        System.out.println(appleBox);
//        System.out.println(appleNewBox);
    }

}
