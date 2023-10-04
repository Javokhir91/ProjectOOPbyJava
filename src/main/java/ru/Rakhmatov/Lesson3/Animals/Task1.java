package ru.geekbrains.lesson3.Animals;

public class Task1 {

    /*
    Создать классы Собака и Кот с наследованием от класса Животное.
    Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
    У каждого животного есть ограничения на действия
    (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    Добавить подсчет созданных котов, собак и животных.
    */
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 300, 200);
        Cat cat2 = new Cat("Персик", 300, 200);

        System.out.println(cat1);
        System.out.println(cat2);


        Animal[] animals = {
                cat1,
                new Cat("Персик", 320, 100),
                new Dog("Быстрый", 500, 20),
                new Dog("Тузик", 1000, 15),
                new Dog("Шарик", 800, 30),
                new Dog("Бима", 500, 50)
        };

        for (Animal a : animals) {
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(1000);
            a.swim(30);
        }

        System.out.println();
        System.out.println("Было создано " + Cat.getCounter() + " котиков.");
        System.out.println("Было создано " + Dog.getCounter() + " собак.");
        System.out.println("Было создано " + Animal.getCounter() + " животных.");

    }

}
