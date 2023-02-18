package org.example.designPatterns.strategy;

public class Test {


    public void run(){
        BirdA birdA=new BirdA("Yoyo");
        BirdB birdB=new BirdB("Toto");

        FlyWayA flyWayA=new FlyWayA();
        FlyWayB flyWayB=new FlyWayB();
        FlyWayC flyWayC=new FlyWayC();

        birdA.setFlyable(flyWayA);
        birdB.setFlyable(flyWayC);

        System.out.println("---Tests---");
        System.out.println("---Bird A should fly in the way A");
        System.out.println("---Bird B should fly in the way C");

        System.out.println(birdA.doFly());
        System.out.println(birdB.doFly());

        System.out.println("---More Tests---");
        birdA.setFlyable(flyWayB);
        System.out.println("---Bird A should fly in the way B");
        System.out.println(birdA.doFly());

    }

}
