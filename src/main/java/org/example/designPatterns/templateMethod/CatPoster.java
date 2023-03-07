package org.example.designPatterns.templateMethod;

public class CatPoster extends Poster{

    @Override
    public void drawImage() {
        System.out.println("\t  /\\_/\\");
        System.out.println("\t ( o.o )");
        System.out.println("\t  > ^ <");
    }

    @Override
    public void drawTitle(String title) {
        System.out.println("\t***"+title+"***");
    }
}
