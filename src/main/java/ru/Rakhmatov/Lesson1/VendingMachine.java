package ru.Rakhmatov.Lesson1;

import java.util.List;

public class VendingMachine {


    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume, int fat, String brand) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat) {
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public BottleOfWater getBottleOfWater(double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Snickers getChocolate(int weight) {
        for (Product product : products) {
            if (product instanceof Snickers){
                Snickers chocolate = (Snickers) product;
                if (chocolate.getWeight() == weight) {
                    return chocolate;
                }
            }
        }
        return null;
    }

}
