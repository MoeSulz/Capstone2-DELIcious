package com.yearup;

import java.util.Scanner;

public class UserInterface {
    static Scanner scan = new Scanner(System.in);

    public void loadEntrance() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Welcome to the Deli");
            System.out.println("===================");
            System.out.println("What would you like to do today?");
            System.out.println("1. New Order");
            System.out.println("2. Exit");
            System.out.println("Enter choice:");
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    loadOrder();
                    break;
                case "2":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void loadOrder() {
        boolean quit = false;
        while (!quit) {
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    addSandwich();
                    break;
                case "2":
                    addDrink();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    checkout();
                case "0":
                    loadEntrance();
            }
        }
    }
    public void addSandwich(){
        System.out.println();
    }
    public void addDrink(){
        System.out.println();
    }
    public void addChips(){
        System.out.println();
    }
    public void checkout(){
        System.out.println();
    }
}