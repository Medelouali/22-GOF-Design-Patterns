package org.example.designPatterns.observer;

public class Test {
    public void run(){
        StockGrabber stockGrabber=new StockGrabber();

        StockObserver observer1=new StockObserver(stockGrabber);

        stockGrabber.setImbPrice(994.40);
        stockGrabber.setGooglePrice(233.99);
        stockGrabber.setApplePrice(732.34);

    };
}
