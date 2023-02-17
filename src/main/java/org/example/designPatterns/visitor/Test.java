package org.example.designPatterns.visitor;

public class Test {

    public void run(){
        Drink vodka=new Drink();
        Luxury pizza=new Luxury();
        Necessity water=new Necessity();

        System.out.println("---Tests for the holyDayTaxCalc---");
        TaxCalc taxCalc=new TaxCalc();
        System.out.println(vodka.accept(taxCalc));
        System.out.println(water.accept(taxCalc));
        System.out.println(pizza.accept(taxCalc));

        System.out.println("---Tests for the holyDayTaxCalc---");
        HolyDayTaxCalc holyDayTaxCalc=new HolyDayTaxCalc();
        System.out.println(vodka.accept(holyDayTaxCalc));
        System.out.println(water.accept(holyDayTaxCalc));
        System.out.println(pizza.accept(holyDayTaxCalc));

    }
}
