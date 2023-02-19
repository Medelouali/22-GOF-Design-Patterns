package org.example.designPatterns.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{
    private double imbPrice;
    private double googlePrice;
    private double applePrice;

    private ArrayList<Observer> observers;

    public StockGrabber() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(this.observers.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(imbPrice, googlePrice, applePrice);
        }
    }

    public void setImbPrice(double imbPrice) {
        this.imbPrice = imbPrice;
        notifyObservers();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObservers();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObservers();
    }
}
