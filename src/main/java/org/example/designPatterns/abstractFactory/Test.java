package org.example.designPatterns.abstractFactory;

import org.example.designPatterns.abstractFactory.conreteWidgets.*;

public class Test {

    public void run(){
        System.out.println("---Generating Android Widgets---");
        System.out.println(new AndroidInput().getName());
        System.out.println(new AndroidButton().getName());
        System.out.println(new AndroidDialog().getName());

        System.out.println("---Generating Ios Widgets---");
        System.out.println(new IosInput().getName());
        System.out.println(new IosButton().getName());
        System.out.println(new IosDialog().getName());
    }
}
