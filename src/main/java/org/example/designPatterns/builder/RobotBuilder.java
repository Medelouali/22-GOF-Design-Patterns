package org.example.designPatterns.builder;

public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotLegs();
    void buildRobotTorso();
    Robot getRobot();
}
