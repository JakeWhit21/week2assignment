package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileInput implements SalesInput {
//    private List<Sale> salesList = new ArrayList<>();

    public List<Sale> getSales() throws IOException {
        String line;
        File file = new File("sales.txt");
        List<Sale> salesList = new ArrayList<>();
        Scanner inputFile = new Scanner(file);

        while(inputFile.hasNext()){
            line = inputFile.nextLine();
            String[] textFileValue = line.split(",");
            salesList.add(new Sale(textFileValue[0],textFileValue[1],Double.parseDouble(textFileValue[2]),Double.parseDouble(textFileValue[3])));
        }
        //
        return salesList;
    }

}



