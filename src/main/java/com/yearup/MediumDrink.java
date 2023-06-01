package com.yearup;

public class MediumDrink {
    private double mediumDrink;
    public double getMediumDrink(){
        return 2.50;
    }

    @Override
    public String toString() {
        return "Medium Drink =" + mediumDrink +
                '}';
    }
}
