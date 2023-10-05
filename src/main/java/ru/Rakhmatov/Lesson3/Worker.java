package ru.Rakhmatov.Lesson3;

public class Worker extends Employee{

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная з/п (фикс): %.2f руб. возрасть:%d",
                surName, name, calculateSalary(), age);
    }
}
