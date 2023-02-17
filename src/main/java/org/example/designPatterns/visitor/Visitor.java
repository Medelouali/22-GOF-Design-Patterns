package org.example.designPatterns.visitor;

public interface Visitor {
    double visit(Drink drink);
    double visit(Necessity necessity);
    double visit(Luxury luxury);
}
