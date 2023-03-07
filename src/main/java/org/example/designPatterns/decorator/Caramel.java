package org.example.designPatterns.decorator;

public class Caramel extends BeverageDecorator {


    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return 2 + this.getBeverage().getCost();
    }
}
