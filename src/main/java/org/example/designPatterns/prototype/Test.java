package org.example.designPatterns.prototype;

public class Test {
    public void run(){
        Car originalCar=new Car("BMW", "200Kms", "Cool Bmw", 4);
        Bus originalBus=new Bus("X", 13L, 4);

        System.out.println("---Original Car---");
        System.out.println(originalCar);
        System.out.println("---Copy Of The Car---");
        System.out.println(originalCar.clone());

        System.out.println("\n\n---Original Bus---");
        System.out.println(originalBus);
        System.out.println("---Copy Of The Bus---");
        System.out.println(originalBus.clone());
    }
}
