package org.example.designPatterns.adapter;

public class EnemyRobotAdapter implements Attacker{

    private EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        this.enemyRobot.smashWithHand();
    }

    @Override
    public void driveForward() {
        this.enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String name) {
        this.enemyRobot.reactToHuman(name);
    }
}
