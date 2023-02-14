package org.example.designPatterns.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Momento> states=new ArrayList<>();

    public void push(Momento state){
        states.add(state);
    }

    public Momento pop(){
        return states.remove(states.size()-1);
    }

}
