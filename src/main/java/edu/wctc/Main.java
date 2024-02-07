package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.impl.ConsoleInput;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean("report", Report.class).generateReport();

    }
}
