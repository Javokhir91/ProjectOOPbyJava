package ru.Rakhmatov.Lesson4;

public class Employee {

    private static int counter;

    private int id;
    {
        id = ++counter;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("$s - %d", name, age);
    }
}
