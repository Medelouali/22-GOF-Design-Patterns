package org.example.designPatterns.visitor;

public class Necessity implements Visitable{
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
