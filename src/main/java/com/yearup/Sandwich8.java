package com.yearup;

public class Sandwich8  extends Sandwich {
    public Sandwich8(String bread, String meat, String cheese, String regularTopping, String sauce, boolean isExtraMeat, boolean isExtraCheese) {
        super(bread, meat, cheese, regularTopping, sauce, isExtraMeat, isExtraCheese);
    }

    @Override
    public double getPrice() {
        return basePrice() + meatPrice() + cheesePrice() + extraMeatPrice() + extraCheesePrice();
    }
    @Override
    public double meatPrice() {
        return 2.00;
    }

    @Override
    public double cheesePrice() {
        return 1.50;
    }

    @Override
    public double extraMeatPrice() {
        if (isExtraMeat() == true) {
            return 1.00;
        } else {
            return 0;
        }
    }

    @Override
    public double extraCheesePrice() {
        if (isExtraCheese() == true) {
            return 0.60;
        } else {
            return 0;
        }
    }

    @Override
    public double basePrice() {
        return 7.00;
    }
}
