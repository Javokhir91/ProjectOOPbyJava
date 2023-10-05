package ru.Rakhmatov.Lesson3;

public class Freelancer extends Employee{

    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная з/п (фикс): %.2f руб. возрасть:%d",
                surName, name, calculateSalary(), age);
    }

}
