package ru.Rakhmatov.Lesson4.bank;

public class Person implements PersonalData{

    private final String fio;

    private final String inn;

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return inn;
    }

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }
}
