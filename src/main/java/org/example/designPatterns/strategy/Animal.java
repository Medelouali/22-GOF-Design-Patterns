package org.example.designPatterns.strategy;

public class Animal {
    private String name;
    private Flyable flyable;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    //The trick is here
    public String doFly(){
        return this.flyable.fly();
    }
}
