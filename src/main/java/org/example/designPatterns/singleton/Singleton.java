package org.example.designPatterns.singleton;

public class Singleton {

    private static Singleton singleton=null;

    //for the sake of simplicity, we 'll use no threads.
    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton==null)singleton= new Singleton();
        return singleton;
    }

}
