package ru.Rakhmatov.Lesson3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    private SortType sortType;

    public SalaryComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return sortType == SortType.Ascending ? Double.compare(o1.calculateSalary(), o2.calculateSalary()) :
                Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
