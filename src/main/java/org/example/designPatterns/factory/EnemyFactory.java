package org.example.designPatterns.factory;

import java.util.Optional;

public class EnemyFactory {
    public static Optional<EnemyShip> getShip(String type){
        if(type=="D")return Optional.of(new DragonEnemyShip());
        if(type=="U")return Optional.of(new UFOEnemyShip());
        return Optional.ofNullable(null);
    }
}
