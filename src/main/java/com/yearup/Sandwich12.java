package com.yearup;

public class Sandwich12 extends Sandwich{
    public Sandwich12(String bread, String meat, String cheese, String regularTopping, String sauce, boolean isExtraMeat, boolean isExtraCheese) {
        super(bread, meat, cheese, regularTopping, sauce, isExtraMeat, isExtraCheese);
    }

    @Override
    public double getPrice() {
        return basePrice() + meatPrice() + cheesePrice() + extraMeatPrice() + extraCheesePrice();
    }
    @Override
    public double meatPrice() {
        return 3.00;
    }

    @Override
    public double cheesePrice() {
        return 2.25;
    }

    @Override
    public double extraMeatPrice() {
        if (isExtraMeat() == true) {
            return 1.50;
        } else {
            return 0;
        }
    }

    @Override
    public double extraCheesePrice() {
        if (isExtraCheese() == true) {
            return 0.90;
        } else {
            return 0;
        }
    }

    @Override
    public double basePrice() {
        return 8.50;
    }
}