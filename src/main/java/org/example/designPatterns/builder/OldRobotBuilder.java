package org.example.designPatterns.builder;

public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        this.robot.setRobotHead("Tik Head");
    }

    @Override
    public void buildRobotLegs() {
        this.robot.setRobotLegs("Big Legs");
    }

    @Override
    public void buildRobotTorso() {
        this.robot.setRobotTorso("Wide Torso");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
