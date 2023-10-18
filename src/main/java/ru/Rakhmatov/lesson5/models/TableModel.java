package ru.geekbrains.lesson5.models;


import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class TableModel implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("The number of the table is incorrect.");
    }

//    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
//
//        for (Table table: loadTables()) {
//            for(Reservation reservation: table.getReservations()){
//                if(reservation.getId() == oldReservation) {
//                    table.getReservations().remove(reservation);
//                }
//            }
//        }
//        return reservationTable(reservationDate, tableNo, name);
//    }

    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){

        for (Table table: tables) {
            Optional<Reservation> reservation = table.getReservations().stream().filter(r -> r.getId() == oldReservation).findFirst();
            if (reservation.isPresent())
            {
                table.getReservations().remove(reservation.get());
                return reservationTable(reservationDate, tableNo, name);
            }
        }
        throw new RuntimeException("Некорректный номер брони");
    }




}