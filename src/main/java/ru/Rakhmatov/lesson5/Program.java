package ru.geekbrains.lesson5;


import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.presenters.Model;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model,view);
        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 3, "Anna");
        view.changeReservationTable(1001, new Date(), 2, "Anna");
    }
}