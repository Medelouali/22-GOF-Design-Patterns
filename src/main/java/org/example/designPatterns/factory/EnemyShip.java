package org.example.designPatterns.factory;

public abstract class EnemyShip {
    private String name;
    private double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void fellowHeroShip(){
        System.out.println(name+" is following the hero ship");
    }

    public void shootEnemy(){
        System.out.println(name+" is shooting now, get outta way");
    }

    public  void doDamage(){
        System.out.println(name+" is doing "+damage+" as damage");
    }
}
