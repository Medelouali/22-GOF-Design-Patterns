package org.example.designPatterns.builder;

public class Robot implements RobotPlan{
    private String robotHead;
    private String robotTorso;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        this.robotHead=head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso=torso;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs=legs;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotLegs() {
        return robotLegs;
    }
}
