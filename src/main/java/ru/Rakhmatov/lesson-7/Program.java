package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();

        Vacancy assistent = Vacancy.ассисент;
        Vacancy programmer = Vacancy.программист;
        Vacancy lawyer = Vacancy.юрист;


        Company google = new Company("Google", jobAgency, 120000, assistent);
        Company yandex = new Company("Yandex", jobAgency, 95000, programmer);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000, lawyer);

        Student student1 = new Student("Студент #1", "юрист");
        Master master1 = new Master("Мастер #1","ассистент" );
        Master master2 = new Master("Мастер #2","программист");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }

}
