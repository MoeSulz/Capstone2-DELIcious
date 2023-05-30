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
        System.out.println("Enter a sandwich size of your choice.");
        System.out.println("4inch, 8inch, 12inch");
        System.out.println("4inch Price: $5.50");
        System.out.println("8inch Price: $7.00");
        System.out.println("12inch Price: $8.50");
        String choice = scan.nextLine();

        System.out.println("What bread would you like?");
        System.out.println("White, Wheat, Rye, or Wrap");
        String bread = scan.nextLine();

        System.out.println("==========Premium Toppings=========");
        System.out.println("What meat would you like?");
        System.out.println("Steak, ham, salami, roast beef, chicken, bacon");
        if (choice.equals("4inch")){
            System.out.println("Price: +$1.00");
        } else if (choice.equals("8inch")) {
            System.out.println("Price: +$2.00");
        } else if (choice.equals("12inch")) {
            System.out.println("Price: +$3.00");
        }
        String meat = scan.nextLine();
        System.out.println("Would you like extra meat?");
        if (choice.equals("4inch")){
            System.out.println("Price: +$0.50");
        } else if (choice.equals("8inch")) {
            System.out.println("Price: +$1.00");
        } else if (choice.equals("12inch")) {
            System.out.println("Price: +$1.50");
        }
        boolean isExtraMeat = scan.nextBoolean();
        scan.nextLine();
        System.out.println("What cheese would you like?");
        System.out.println("American, provolone, cheddar, swiss");
        if (choice.equals("4inch")){
            System.out.println("Price: +$0.75");
        } else if (choice.equals("8inch")) {
            System.out.println("Price: +$1.50");
        } else if (choice.equals("12inch")) {
            System.out.println("Price: +$2.25");
        }
        String cheese = scan.nextLine();
        System.out.println("Would you like extra cheese?");
        if (choice.equals("4inch")){
            System.out.println("Price: +$0.30");
        } else if (choice.equals("8inch")) {
            System.out.println("Price: +$0.60");
        } else if (choice.equals("12inch")) {
            System.out.println("Price: +$0.90");
        }
        boolean isExtraCheese = scan.nextBoolean();

        System.out.println("=========Regular Toppings=========");
        System.out.println("What regular toppings would you like?");
        System.out.println("Lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, and mushrooms");
        scan.nextLine();
        String regularToppings = scan.nextLine();

        System.out.println("What sauce would you like?");
        System.out.println("Sauces: Mayo, mustard, ketchup, ranch, thousand islands, vinegar");
        String sauce = scan.nextLine();
        if (choice.equals("4inch")) {
            Sandwich4 sandwich4 = new Sandwich4(bread, meat, cheese, regularToppings, sauce, isExtraMeat, isExtraCheese);
            System.out.println(sandwich4);
        } else if (choice.equals("8inch")) {
            Sandwich8 sandwich8 = new Sandwich8(bread, meat, cheese, regularToppings, sauce, isExtraMeat, isExtraCheese);
            System.out.println(sandwich8);
        } else if (choice.equals("12inch")) {
            Sandwich12 sandwich12 = new Sandwich12(bread, meat, cheese, regularToppings, sauce, isExtraMeat, isExtraCheese);
            System.out.println(sandwich12);
        }
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