package com.yearup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ReceiptPrint {
    public static void main(String[] args) {
        int totalCount = 10; // Assuming a value of 10 for demonstration purposes

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String formattedDate = myDateObj.format(myFormatObj);
        String filePath = "/Desktop/receiptmanager/";
        String fileName = formattedDate;
        String fileType = "txt";

        for (int counter = 2; counter < totalCount; counter++) {
            int size = 250;
            // TBD
            File myFile;
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "." + fileType));
                myFile = new File(filePath + fileName + counter + "." + fileType);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Do something with the file...
            System.out.println("File path: " + myFile.getAbsolutePath());
        }
}
}
