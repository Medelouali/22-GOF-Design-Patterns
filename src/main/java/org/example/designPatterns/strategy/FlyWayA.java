package org.example.designPatterns.strategy;

public class FlyWayA implements Flyable{

    @Override
    public String fly() {
        return "This animal can fly the A way, it's unique";
    }
}
