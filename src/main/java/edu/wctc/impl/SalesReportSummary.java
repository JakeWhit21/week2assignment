package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SalesReportSummary implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {

            System.out.printf("%s %15s %15s %15s  %n", "Country","Amount","Tax", "Shipping");

            List countriesList = new ArrayList();

            for (Sale sale : salesList) {
                countriesList.add(sale.getCountry());
            }

            HashSet<String> countries = new HashSet(countriesList);


            for(String country : countries){
                double total = 0;
                double tax = 0;
                double ship = 0;

                for (Sale sale : salesList) {
                    if (sale.getCountry().equals(country)) {
                        total += sale.getAmount();
                        tax += sale.getTax();
                        ship += sale.getShipping();
                    }
                }
                System.out.printf("%s %15.2f %15.2f %15.2f  %n", country, total, tax, ship);
            }
    }
}
