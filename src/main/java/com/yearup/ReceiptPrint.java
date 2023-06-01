package com.yearup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ReceiptPrint {
    public static void main(String[] args) { throws IOException {

    }
    int totalCount = 10; // Assuming a value of 10 for demonstration purposes

    String filePath = "~/Desktop/receipt/";
    String fileName = "reethoome";
    String fileType = "txt";

        for (int counter = 2; counter < totalCount; counter++) {
        int size = 250;
        // TBD
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName+"."+fileType));
        File myFile = new File(filePath + fileName + counter + "." + fileType);

        // Do something with the file...
        System.out.println("File path: " + myFile.getAbsolutePath());
    }
}
}
