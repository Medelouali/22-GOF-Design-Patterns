package org.example.designPatterns.adapter;

public class Test {

    public Test(){}

    public void run(){
        EnemyAttacker enemyAttacker=new EnemyAttacker();
        EnemyRobot enemyRobot=new EnemyRobot();
        EnemyRobotAdapter enemyRobotAdapter=new EnemyRobotAdapter(enemyRobot);

        System.out.println("---Tests for enemyAttacker---");
        enemyAttacker.fireWeapon();
        enemyAttacker.driveForward();
        enemyAttacker.assignDriver("James");

        System.out.println("---Tests for the enemyRobot---");
        enemyRobot.smashWithHand();
        enemyRobot.walkForward();
        enemyRobot.reactToHuman("James");

        System.out.println("---Tests for the enemyRobotAdapter---");
        enemyRobotAdapter.fireWeapon();
        enemyRobotAdapter.driveForward();
        enemyRobotAdapter.assignDriver("James");
    }
}
