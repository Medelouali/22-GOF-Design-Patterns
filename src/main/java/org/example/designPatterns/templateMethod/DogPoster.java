package org.example.designPatterns.templateMethod;

public class DogPoster extends Poster{

    @Override
    public void drawImage() {
        System.out.println("\t     /\\__/\\");
        System.out.println("\t    /`    '\\");
        System.out.println("\t  === 0  0 ===");
        System.out.println("\t    \\  --  /");
        System.out.println("\t   /        \\");
        System.out.println("\t  /          \\");
    }

    @Override
    public void drawTitle(String title) {
        System.out.println("\t***"+title+"***");
    }
}
