package com.yearup;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Receipts {
    private static ArrayList<Receipts> receipts = new ArrayList<>();
    private static final String FILE_NAME = "receiptmanager.txt";
    private static final String DATE_FORMAT = "yyyyMMdd-";
    private static final String TIME_FORMAT = "hhmmss";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);

    public static void main(String[] args) {
        String directoryPath = "Desktop/receiptmanager/";
        String[] entries = {"Entry 1", "Entry 2", "Entry 3"};
        loadTransactions(FILE_NAME);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
}

    public static void loadTransactions(String fileName) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String directoryPath = "Desktop/receiptmanager/";
        String[] entries = {"Entry 1", "Entry 2", "Entry 3"};
        try {
            for (int i = 0; i < entries.length; i++) {

                fileName = date + "-" + time + ".txt";
                String filepath = directoryPath + fileName;
                File file = new File(filepath);
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(entries[i]);
                writer.close();
                System.out.println("Entry " + i + " written successfully to " + fileName);
            }
        } catch (IOException e) {
            System.out.println("Error loading receipt: " + e.getMessage());
        }
    }}
