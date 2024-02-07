package edu.wctc;

import edu.wctc.iface.ShippingPolicy;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.SalesInput;
import edu.wctc.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
//        return new ConsoleInput();
        return new TextFileInput();
    }

    @Bean
    public SalesReport salesReport() {
//        return new SalesReportDetail();
        return new SalesReportSummary();
    }

    @Bean
    public ShippingPolicy policy() {
//        return new FreeShipping();
//        return new FlatRateShipping();
        return new FreeShippingOverAmount();
    }
}
