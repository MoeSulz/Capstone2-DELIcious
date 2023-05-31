package com.yearup;

public abstract class Sandwich {
    private String bread;
    private String meat;
    private String cheese;
    private String regularTopping;
    private String sauce;
    private boolean isExtraMeat;
    private boolean isExtraCheese;
    private double price;

    public Sandwich(String bread, String meat, String cheese, String regularTopping, String sauce, boolean isExtraMeat, boolean isExtraCheese) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.regularTopping = regularTopping;
        this.sauce = sauce;
        this.isExtraMeat = isExtraMeat;
        this.isExtraCheese = isExtraCheese;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getRegularTopping() {
        return regularTopping;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isExtraMeat() {
        return isExtraMeat;
    }

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public abstract double getPrice();
    public abstract double meatPrice();
    public abstract double cheesePrice();
    public abstract double extraMeatPrice();
    public abstract double extraCheesePrice();
    public abstract double basePrice();

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", regularTopping='" + regularTopping + '\'' +
                ", sauce='" + sauce + '\'' +
                ", isExtraMeat=" + isExtraMeat +
                ", isExtraCheese=" + isExtraCheese + "}";
    }
}
