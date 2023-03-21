package org.example.designPatterns.prototype;

public class Bus implements Vehicle{
    private static long id=0;
    private String model;
    private long numPlaces;
    private int plateNumber;
    private long busId;


    public Bus(String model, long numPlaces, int plateNumber) {
        this.model = model;
        this.numPlaces = numPlaces;
        this.plateNumber = plateNumber;
        this.busId=id++;
    }

    private Bus(Bus bus){
        this.model=bus.model;
        this.numPlaces=bus.numPlaces;
        this.plateNumber=bus.plateNumber;
        this.busId=id++;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", numPlaces=" + numPlaces +
                ", plateNumber='" + plateNumber + '\'' +
                ", busId=" + busId +
                '}';
    }
}
