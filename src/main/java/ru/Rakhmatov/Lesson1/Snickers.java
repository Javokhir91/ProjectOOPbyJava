package ru.Rakhmatov.Lesson1;

public class Snickers extends Product{

    private String bars; // батончики
    private int weight; // вес шоколадки

    public String getBars() {
        return bars;
    }

    public void setBars(String bars) {
        this.bars = bars;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Snickers(String brand, String name, double price, String bars, int weight) {
        super(brand, name, price);
        this.bars = "Батончик";
        this.weight = weight;
    }



    @Override
    public String displayInfo() {
        return String.format("[CHOCOLATE] %s - %s - Цена: %.2f руб. - %s: %dгр.", brand, name, price, bars, weight);
    }


}
