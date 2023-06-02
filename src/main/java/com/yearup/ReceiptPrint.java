package com.yearup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class ReceiptPrint {
    static UserInterface userInterface = new UserInterface();
    static double totalCost = 0;
    public static void saveReceipt(ArrayList<Sandwich4> sandwich4s, ArrayList<Sandwich8> sandwich8s, ArrayList<Sandwich12> sandwich12s, ArrayList<String> drinks, ArrayList<String> chips) {
        int totalCount = 10; // Assuming a value of 10 for demonstration purposes

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String formattedDate = myDateObj.format(myFormatObj);
        String filePath = "~/Desktop/LearnToCode_Capstones/Capstone2-DELIcious/receiptmanager/";
        String fileName = formattedDate;
        String fileType = "txt";

        for (int counter = 2; counter < totalCount; counter++) {
            int size = 250;
            // TBD
            File myFile;
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "." + fileType));
                myFile = new File(filePath + fileName + counter + "." + fileType);
                for (int i = 0; i < sandwich4s.size(); i++) {
                    if (!(sandwich4s.get(i).getBread().equals(null))) {
                        writer.write(String.valueOf(sandwich4s));
                    }
                }
                for (int i = 0; i < sandwich8s.size(); i++) {
                    if (!(sandwich8s.get(i).getBread().equals(null))) {
                        writer.write(String.valueOf(sandwich8s));
                    }
                }
                for (int i = 0; i < sandwich12s.size(); i++) {
                    if (!(sandwich12s.get(i).getBread().equals(null))) {
                        writer.write(String.valueOf(sandwich12s));
                    }
                }
                for (int i = 0; i < drinks.size(); i++) {
                    if (!(drinks.get(i).isEmpty())) {
                        writer.newLine();
                        writer.write("Drink: " + drinks);
                    }
                }
                for (int i = 0; i < chips.size(); i++) {
                    if (!(chips.get(i).isEmpty())) {
                        writer.newLine();
                        writer.write("Chips: " + chips);
                    }
                }
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Do something with the file...
        }
    }
}

