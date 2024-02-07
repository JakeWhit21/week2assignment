package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ShippingPolicy;

public class FreeShippingOverAmount implements ShippingPolicy {

    @Override
    public void applyShipping(Sale sale) {
        if (sale.getAmount() >= 80) {
            sale.setShipping(0);
        } else {
            sale.setShipping(10);
        }
    }
}
