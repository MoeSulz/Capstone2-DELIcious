package com.yearup;

public class Sandwich12 extends Sandwich{
    public Sandwich12(String bread, String meat, String cheese, String regularTopping, String sauce, boolean isExtraMeat, boolean isExtraCheese) {
        super(bread, meat, cheese, regularTopping, sauce, isExtraMeat, isExtraCheese);
    }

    @Override
    public double getPrice() {
        return 0;
    }

}
