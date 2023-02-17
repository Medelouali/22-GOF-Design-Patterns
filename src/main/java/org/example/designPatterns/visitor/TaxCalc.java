package org.example.designPatterns.visitor;

public class TaxCalc implements Visitor{
    @Override
    public double visit(Drink drink) {
        return 2;
    }

    @Override
    public double visit(Necessity necessity) {
        return 1;
    }

    @Override
    public double visit(Luxury luxury) {
        return 3;
    }
}
