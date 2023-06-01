package com.yearup;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {



    static Scanner scan = new Scanner(System.in);
    static ArrayList<Sandwich4> sandwich4s = new ArrayList<>();
    static ArrayList<Sandwich8> sandwich8s = new ArrayList<>();
    static ArrayList<Sandwich12> sandwich12s = new ArrayList<>();

    static ArrayList<String> drinks = new ArrayList<>();
    static ArrayList<String> chips = new ArrayList<>();
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
        String yesNo = scan.nextLine();
        boolean isExtraMeat = true;
        if (yesNo.equalsIgnoreCase("yes")) {
            isExtraMeat = true;
        } else if (yesNo.equalsIgnoreCase("no")) {
            isExtraMeat = false;
        }
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
        String noYes = scan.nextLine();
        boolean isExtraCheese = true;
        if (noYes.equalsIgnoreCase("yes")) {
            isExtraCheese = true;
        } else if (noYes.equalsIgnoreCase("no")) {
            isExtraCheese = false;
        }
        System.out.println("=========Regular Toppings=========");
        System.out.println("What regular toppings would you like?");
        System.out.println("Lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, and mushrooms");
        String regularToppings = scan.nextLine();

        System.out.println("What sauce would you like?");
        System.out.println("Sauces: Mayo, mustard, ketchup, ranch, thousand islands, vinegar");
        String sauce = scan.nextLine();
        if (choice.equals("4inch")) {
            Sandwich4 sandwich4 = new Sandwich4(bread, meat, cheese, regularToppings, sauce, isExtraMeat, isExtraCheese);
            System.out.println(sandwich4);
            sandwich4s.add(sandwich4);
            System.out.println(sandwich4.getPrice());

        } else if (choice.equals("8inch")) {
            Sandwich8 sandwich8 = new Sandwich8(bread, meat, cheese, regularToppings, sauce, isExtraMeat, isExtraCheese);
            System.out.println(sandwich8);
            sandwich8s.add(sandwich8);
            System.out.println(sandwich8.getPrice());
        } else if (choice.equals("12inch")) {
            Sandwich12 sandwich12 = new Sandwich12(bread, meat, cheese, regularToppings, sauce, isExtraMeat, isExtraCheese);
            System.out.println(sandwich12);
            sandwich12s.add(sandwich12);
            System.out.println(sandwich12.getPrice());
        }
        System.out.println("Would you like any drinks or chips?");
        String chipsDrink = scan.nextLine();
        if (chipsDrink.equalsIgnoreCase("yes")){
            loadOrder();
        } else if (chipsDrink.equalsIgnoreCase("no")) {
            loadOrder();

        }
    }
    public void addDrink() {
        System.out.println("Enter the size drink you would like to add:");
        System.out.println("Small $2.00, Medium $2.50, Large $3.00");
        String drink = scan.nextLine();
        SmallDrink smallDrink = new SmallDrink();
        MediumDrink mediumDrink = new MediumDrink();
        LargeDrink largeDrink = new LargeDrink();
        if (drink.equalsIgnoreCase("small")){
            smallDrink.getSmallDrink();
            System.out.println(smallDrink);
        } else if (drink.equalsIgnoreCase("medium")) {
            mediumDrink.getMediumDrink();
            System.out.println(mediumDrink);
        } else if (drink.equalsIgnoreCase("large")) {
            largeDrink.getLargeDrink();
            System.out.println(largeDrink);

        }
        drinks.add(drink);

        System.out.println("Drink added !!!");

    }

    public void addChips() {
        Chips chips1 = new Chips();
        System.out.println("Would you like chips on your order?");
        String chipsType = scan.nextLine();
        chips1.getChips();
        chips.add(chipsType);
        System.out.println("Chips added !!!");
    }
    public double calculateDrinkPrice(String drink) {
        SmallDrink smallDrink = new SmallDrink();
        MediumDrink mediumDrink = new MediumDrink();
        LargeDrink largeDrink = new LargeDrink();
        double price = 0.00;

        switch (drink.toLowerCase()) {
            case "small":
                price = smallDrink.getSmallDrink();
                break;
            case "medium":
                price = mediumDrink.getMediumDrink();
                break;
            case "large":
                price = largeDrink.getLargeDrink();
                break;
            default:
                System.out.println("Invalid drink size: " + drink);
                break;
        }
        return price;
    }

    public double calculateChipsPrice(String chipsType) {
        Chips chips1 = new Chips();
        double price = 0.00;

        switch (chipsType.toLowerCase()) {
            case "yes":
                price = chips1.getChips();
                break;
            default:
                System.out.println("Invalid chips type: " + chipsType);
                break;
        }
        return price;
    }

    public void checkout(){
        double totalCost = 0.00;
        System.out.println("======= Order Summary =======");
        System.out.println("Sandwiches:");
        for (Sandwich4 sandwich4 : sandwich4s) {
            System.out.println(sandwich4);
            totalCost += sandwich4.getPrice();
        }
        for (Sandwich8 sandwich8 : sandwich8s) {
            System.out.println(sandwich8);
            totalCost += sandwich8.getPrice();
        }
        for (Sandwich12 sandwich12 : sandwich12s) {
            System.out.println(sandwich12);
            totalCost += sandwich12.getPrice();
        }

        System.out.println("Drinks:");
        for (String drink : drinks) {
            System.out.println(drink);
            totalCost += calculateDrinkPrice(drink);
        }

        System.out.println("Chips:");
        for (String chip : chips) {
            System.out.println(chip);
            totalCost += calculateChipsPrice(chip);
        }

        System.out.println("=============================");
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Thank you for your order!");
        ReceiptPrint.saveReceipt(sandwich4s, sandwich8s, sandwich12s, drinks, chips);

        sandwich4s.clear();
        sandwich8s.clear();
        sandwich12s.clear();
        drinks.clear();
        chips.clear();


    }




}