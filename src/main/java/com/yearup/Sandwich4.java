package com.yearup;

public class Sandwich4 extends Sandwich {
    public Sandwich4(String bread, String meat, String cheese, String regularTopping, String sauce, boolean isExtraMeat, boolean isExtraCheese) {
        super(bread, meat, cheese, regularTopping, sauce, isExtraMeat, isExtraCheese);
    }

    @Override
    public double getPrice() {
        return basePrice() + meatPrice() + cheesePrice() + extraMeatPrice() + extraCheesePrice();
    }

    @Override
    public double meatPrice() {
        return 1.00;
    }

    @Override
    public double cheesePrice() {
        return 0.75;
    }

    @Override
    public double extraMeatPrice() {
        if (isExtraMeat() == true) {
            return 0.50;
        } else {
            return 0;
        }
    }

    @Override
    public double extraCheesePrice() {
        if (isExtraCheese() == true) {
            return 0.30;
        } else {
            return 0;
        }
    }

    @Override
    public double basePrice() {
        return 5.50;
    }
}
