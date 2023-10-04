package ru.Rakhmatov.Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2{

    static Random random = new Random();

    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(18, 60);
        int salary = random.nextInt(50000, 110000);
        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }

    static Freelancer generateFreelance(){

        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(18, 60);
        int salary = random.nextInt(1000, 3000);
        Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return freelancer;
    }


    static Employee[] generateEmployees(int count){

        Employee[] employees = new Employee[count];

        for (int i = 0; i < employees.length; i++) {

            int o = random.nextInt(1,3);
            if (o == 1) {
                employees[i] = generateWorker();
            } else {
                employees[i] = generateFreelance();
            }
        }

        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(10);

//        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
//
//        System.out.println();
//
//        Arrays.sort(employees, new SalaryComparator(SortType.Descending));
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }


    }

}
