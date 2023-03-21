package org.example.designPatterns.prototype;

public class Car implements Vehicle{
    private static long id=0;
    private String model;
    private String milesAge;
    private String description;
    private int plateNumber;
    private long carId;

    public Car(String model, String milesAge, String description, int placeNumber) {
        this.model = model;
        this.milesAge = milesAge;
        this.description = description;
        this.carId=id++;
        this.plateNumber=placeNumber;
    }

    private Car(Car car){
        this.model=car.model;
        this.milesAge=car.milesAge;
        this.description=car.description;
        this.carId=id++;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", milesAge='" + milesAge + '\'' +
                ", description='" + description + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", carId=" + carId +
                '}';
    }
}
