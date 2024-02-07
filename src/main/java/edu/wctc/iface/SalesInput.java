package edu.wctc.iface;

import edu.wctc.Sale;

import java.io.IOException;
import java.util.List;

public interface SalesInput {
    List<Sale> getSales() throws IOException;
}
