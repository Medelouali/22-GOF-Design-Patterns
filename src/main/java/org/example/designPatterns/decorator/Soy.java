package org.example.designPatterns.decorator;

public class Soy extends BeverageDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return 1 + this.getBeverage().getCost();
    }
}
