package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {


    @Override
    public List<Sale> getSales() {
        Scanner keyboard = new Scanner(System.in);
        String customer;
        String country;
        double amount;
        double tax;

        String input;

        List<Sale> salesList = new ArrayList<>();

        System.out.println("Do you want to enter new data? (Y or N)");

        input= keyboard.nextLine().toUpperCase();

        while (input.equals("Y")){
            System.out.println("Enter Customer:");
            customer = keyboard.nextLine();

            System.out.println("Country:");
            country = keyboard.nextLine();

            System.out.println("Sales:");
            amount = keyboard.nextDouble();

            System.out.println("Taxes:");
            tax = keyboard.nextDouble();

            salesList.add(new Sale(customer, country, amount, tax));

            System.out.println("Do you want to enter new data? (Y or N)");
            input= keyboard.nextLine();

        }
        return salesList;
    }
}
