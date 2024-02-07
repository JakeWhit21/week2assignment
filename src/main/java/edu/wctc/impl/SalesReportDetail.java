package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;

import java.util.List;

public class SalesReportDetail implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.printf("%s %15s %15s %15s %15s %n", "Customer","Country","Amount","Tax", "Shipping");

        for (Sale sale : salesList) {
            System.out.printf("%s %15s %15.2f %15s %15.2f %n", sale.getCustomer(), sale.getCountry(), sale.getAmount(), sale.getTax(), sale.getShipping());
        }
    }
}

