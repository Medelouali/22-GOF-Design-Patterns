package org.example.designPatterns.adapter;

public class EnemyAttacker implements Attacker{

    @Override
    public void fireWeapon() {
        System.out.println("I am the enemy attacker and I am firing this weapon");
    }

    @Override
    public void driveForward() {
        System.out.println("I am the enemy attacker and I am driving forwards");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println("I am the enemy attacker and I am assigning new driver with name "+name);
    }
}
