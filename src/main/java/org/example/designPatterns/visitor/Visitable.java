package org.example.designPatterns.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
