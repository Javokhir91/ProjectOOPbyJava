package ru.Rakhmatov.Lesson4.services;

import ru.Rakhmatov.Lesson4.Employee;

import java.util.List;

public interface Repository<T, TId> {

    void add(T item);
    void update(T item);

    void delete(TId id);

    List<T> getAll();
}
