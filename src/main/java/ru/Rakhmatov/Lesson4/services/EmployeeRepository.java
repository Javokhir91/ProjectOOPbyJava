package ru.Rakhmatov.Lesson4.services;

import ru.Rakhmatov.Lesson4.Employee;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee, Integer>{

    List<Employee> getByDepartmentId(int id);

}
