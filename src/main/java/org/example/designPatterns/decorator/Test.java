package org.example.designPatterns.decorator;

public class Test {
    public void run(){
        Beverage expresso=new Expresso();
        Beverage decaf=new Decaf();

        System.out.println("Decaf Price:\t"+decaf.getCost());
        System.out.println("Expresso Price:\t"+expresso.getCost());

        Beverage expressoWithcaramel=new Caramel(expresso);
        Beverage expressoWithSoy=new Soy(expresso);

        System.out.println("Expresso With Caramel Price:\t"+expressoWithcaramel.getCost());
        System.out.println("Expresso With Soy Price:\t"+expressoWithSoy.getCost());

        System.out.println("I Love Coffee;)");
    }
}
