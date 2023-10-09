package ru.Rakhmatov.Lesson4.HwLes4;

public class Apple extends Fruit{

    private String name = "apple";
    public Apple() {
        super(1f);

    }

    public Apple(int quantity) {
        super(quantity);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
