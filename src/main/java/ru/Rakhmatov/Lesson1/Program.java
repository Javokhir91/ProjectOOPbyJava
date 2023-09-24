package ru.Rakhmatov.Lesson1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product("BonAqua", "Bottle of water(1)", 150);
        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Bottle of water(3)", 450);
        System.out.println(product3.displayInfo());

        Product bottleOfWater = new BottleOfWater("BonAqua", "Bottle of Water(1)", 200, 1);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("Parma lat", "Bottle of Milk(1)", 250, 2, 5);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Parma lat", "Bottle of Milk(2)", 300, 3, 10);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 = new BottleOfMilk("Parma lat", "Bottle of Milk(3)", 350, 4, 15);
        System.out.println(bottleOfMilk3.displayInfo());

        Product bottleOfMilk4 = new BottleOfMilk("Parma lat", "Bottle of Milk(4)", 400, 5, 30);
        System.out.println(bottleOfMilk4.displayInfo());

        Product snickers = new Snickers("Choco", "Snickers", 100, "bars", 50);
        System.out.println(snickers.displayInfo());

        Product mars = new Snickers("Choco", "Mars", 105, "bars", 50);
        System.out.println(mars.displayInfo());

        Product twix = new Snickers("Choco", "Twix", 100, "bars", 50);
        System.out.println(twix.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(snickers);
        products.add(mars);
        products.add(twix);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk(5, 30, "Parma lat");
        System.out.println("-".repeat(80));
        if (bottleOfMilk == null) {
            System.out.println("Такого товара нет в автомате!");
            System.out.println("-".repeat(bottleOfMilk.displayInfo().length()));
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
            System.out.println("-".repeat(80));
        }

        BottleOfWater bottleOfWater2 = vendingMachine.getBottleOfWater(5);
        System.out.println("-".repeat(80));
        if (bottleOfWater2 == null) {
            System.out.println("[bottleOfWater2] -> Такого товара нет в автомате!");
            System.out.println("-".repeat(80));
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfWater2.displayInfo());
            System.out.println("-".repeat(80));
        }

        Snickers snickers1 = vendingMachine.getChocolate(80);
        if (snickers1 == null) {
            System.out.println("[snickers1] -> Такого товара нет в автомате!");
            System.out.println("-".repeat(80));
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(snickers1.displayInfo());
            System.out.println("-".repeat(80));
        }
    }
}
