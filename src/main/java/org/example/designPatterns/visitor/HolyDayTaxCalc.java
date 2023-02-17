package org.example.designPatterns.visitor;

public class HolyDayTaxCalc implements Visitor{

    @Override
    public double visit(Drink drink) {
        return 0.9;
    }

    @Override
    public double visit(Necessity necessity) {
        return 0.1;
    }

    @Override
    public double visit(Luxury luxury) {
        return 0.5;
    }
}
