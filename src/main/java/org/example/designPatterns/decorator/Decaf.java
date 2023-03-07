package org.example.designPatterns.decorator;

public class Decaf extends Beverage{
    @Override
    public String getDescription() {
        return "Niice Decaf";
    }

    @Override
    public double getCost() {
        return 1;
    }
}
