package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Input {

//    private Scanner scanner = new Scanner(System.in);

    private String clientName = prompt("Client name: ");
    private String product = prompt("Product: ");
    private int qnt  = Integer.parseInt(prompt("Quantity: "));
    private double price = Double.parseDouble(prompt("Price: "));

    public Input() {
    }

//    public void inputFromConsole(){
//        clientName = prompt("Client name: ");
//        product = prompt("Product: ");
//        qnt = Integer.parseInt(prompt("Quantity: "));
//        price = Double.parseDouble(prompt("Price: "));

//    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }
}
