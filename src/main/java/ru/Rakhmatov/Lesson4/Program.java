package ru.Rakhmatov.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee employee = new Employee("AAAA", 33);
        ArrayList<Employee> arrayList1 = new ArrayList();
        //arrayList1.add(45);
        arrayList1.add(employee);
        arrayList1.add(employee);
        arrayList1.add(employee);
        arrayList1.add(employee);


        for (Employee o: arrayList1) {
                System.out.println(o.getName());
            }



        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[10]);
        myArrayList.add(employee);
        myArrayList.add(employee);
        myArrayList.add(employee);
        System.out.println("Общее кол-во элементов: " + myArrayList.size());
    }

}
