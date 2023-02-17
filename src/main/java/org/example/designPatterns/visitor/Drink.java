package org.example.designPatterns.visitor;

public class Drink implements Visitable{
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
