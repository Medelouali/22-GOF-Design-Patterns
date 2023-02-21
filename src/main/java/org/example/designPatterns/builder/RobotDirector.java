package org.example.designPatterns.builder;

public class RobotDirector {
    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public void makeRobot(){
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotLegs();
        robotBuilder.buildRobotTorso();
    }

    public void makeHeadlessRobot(){
        robotBuilder.buildRobotLegs();
        robotBuilder.buildRobotTorso();
    }

    Robot build(){
        return this.robotBuilder.getRobot();
    }
}
