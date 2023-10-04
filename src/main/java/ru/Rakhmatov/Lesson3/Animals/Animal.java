package ru.geekbrains.lesson3.Animals;

public abstract class Animal {

    public static int counter;
    private static int idCounter;

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    private int id;

    protected static int getCounter(){
        return counter;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    {
        System.out.println("Initializer Animal");
        counter++;
        id = ++idCounter;
        name = "Животное";
        maxRun = 200;
        maxSwim = 200;
    }

    static {
        System.out.println("Static Initializer Animal");
        idCounter = 1000;
    }

    public Animal() {
        System.out.println("Constructor Animal");
    }

    public Animal(String name) {
        System.out.println("Constructor Animal");
        this.name = name;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Constructor Animal");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance){
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else System.out.printf("%s не смог пробежать %d метров\n", name, distance);
    }

    public void swim(int distance){
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else System.out.printf("%s не смог проплыть %d метров\n", name, distance);
    }

    @Override
    public String toString() {
        return String.format("[%d] - %s", id, name);
    }
}
