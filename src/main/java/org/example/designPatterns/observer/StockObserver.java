package org.example.designPatterns.observer;

public class StockObserver implements Observer{
    private double imbPrice;
    private double googlePrice;
    private double applePrice;
    private Subject stockGrabber;
    private long observerId;
    private static long observerCount;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber=stockGrabber;
        this.observerId=++observerCount;
        System.out.println("Observer # "+observerId+" was created");
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double googlePrice, double applePrice) {
        this.imbPrice=ibmPrice;
        this.googlePrice=googlePrice;
        this.applePrice=applePrice;

        System.out.println("---Observer number # "+this.observerId+"---");
        System.out.println("IBMPrice:\t"+ibmPrice);
        System.out.println("GooglePrice:\t"+googlePrice);
        System.out.println("ApplePrice:\t"+applePrice);
    }
}
