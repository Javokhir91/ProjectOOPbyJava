package ru.geekbrains.lesson5.views;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View { // ОТОБРАЖАЕТ ПРИЛОЖЕНИЕ БРОНИРОВАНИЯ НА ЭКРАН

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /**
     *
     * @param tables коллекция столиков
     */
    public void showTables(Collection<Table> tables){
        for(Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("The table was booked. Number of your booking: #%d\n", reservationNo);
        }
        else {
            System.out.println("The booking was unsuccesfull. Try again later.");
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name) {
        if (observer != null)
            observer.onReservationTable(orderDate, tableNo, name);
    }


    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        if (observer != null)
            observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}