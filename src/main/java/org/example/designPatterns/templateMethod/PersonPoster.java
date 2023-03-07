package org.example.designPatterns.templateMethod;

public class PersonPoster extends Poster{

    @Override
    public void drawImage() {
        System.out.println("\t  /////");
        System.out.println("\t + o o +");
        System.out.println("\t|   ^   |");
        System.out.println("\t|  '-'  |");
        System.out.println("\t+-------+");
    }

    @Override
    public void drawTitle(String title) {

    }
}
