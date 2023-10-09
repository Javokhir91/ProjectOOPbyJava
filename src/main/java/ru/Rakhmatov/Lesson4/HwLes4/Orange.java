package ru.Rakhmatov.Lesson4.HwLes4;

public class Orange extends Fruit{

    private String name = "orange";
    public Orange() {
        super(1.5f);
    }

    public Orange(int quantity) {
        super(quantity);
    }

    @Override
    public String toString() {
        return name;
    }
}
