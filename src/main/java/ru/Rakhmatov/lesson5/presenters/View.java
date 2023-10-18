package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void setObserver(ViewObserver observer);

    void reservationTable(Date orderDate, int tableNo, String name);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}