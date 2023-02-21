package org.example.designPatterns.builder;

public class Test {

    public void run(){
        RobotBuilder robotBuilder=new OldRobotBuilder();

        RobotDirector robotDirector=new RobotDirector(robotBuilder);
        robotDirector.makeRobot();

        Robot bot = robotDirector.build();
        System.out.println("---Tests---");
        System.out.println("Head:\t"+bot.getRobotHead());
        System.out.println("Legs:\t"+bot.getRobotLegs());
        System.out.println("Torso:\t"+bot.getRobotTorso());

        RobotBuilder robotBuilder2=new OldRobotBuilder();
        RobotDirector robotDirector2=new RobotDirector(robotBuilder2);
        robotDirector2.makeHeadlessRobot();

        Robot bot2 = robotDirector2.build();
        System.out.println("---Headless Bots Tests---");
        System.out.println("Head:\t"+bot2.getRobotHead());
        System.out.println("Legs:\t"+bot2.getRobotLegs());
        System.out.println("Torso:\t"+bot2.getRobotTorso());
    }
}
