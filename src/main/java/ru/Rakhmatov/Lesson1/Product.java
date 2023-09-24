package ru.Rakhmatov.Lesson1;

public class Product {

    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        checkName(name);
    }
    public void setBrand(String brand) {
        checkBrand(brand);
    }
    public void setPrice(double price) {
        checkPrice(price);
    }
    public Product() {
        this("<Product>");
    }
    public Product (String name) {
        this(name, 100);
    }
    public Product (String name, double price) {
        this("<Brant>", name, price);
    }
    public Product (String brand, String name, double price) {
        checkBrand(brand); checkName(name); checkPrice(price);
    }
    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3) {
            this.brand = "<Brand>";
        }
        else {
            this.brand = brand;
        }
    }
    private void checkName(String name){
        if (name == null || name.length() < 3) {
            this.name = "<Product>";
        }
        else {
            this.name = name;
        }
    }
    private void checkPrice(double price){
        if (price < 100) {
            this.price = 100;
        }
        else {
            this.price = price;
        }
    }
}
