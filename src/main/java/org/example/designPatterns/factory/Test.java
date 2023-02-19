package org.example.designPatterns.factory;

import java.util.Optional;

public class Test {

    public void run(){
        String type="S";//this could be decided in runtime of
        Optional<EnemyShip> enemyShip= EnemyFactory.getShip(type);
        if(enemyShip.isPresent()){
            System.out.println(enemyShip.get().getName());
        }else{
            System.out.println("Whoops wrong type of enemy");
        }
    }
}
