package org.example.designPatterns.adapter;

public class EnemyRobot {

    public void smashWithHand(){
        System.out.println("I m the enemy rebot I can smash with my hands");
    }

    public void walkForward(){
        System.out.println("I am robot enemy and I am walking forwards");
    }

    public void reactToHuman(String name){
        System.out.println("I am robot enemy and I am killing "+name);
    }


}
