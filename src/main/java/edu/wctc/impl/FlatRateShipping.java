package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {

    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(10);
    }
}
