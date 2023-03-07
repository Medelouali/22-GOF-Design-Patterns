package org.example.designPatterns.templateMethod;

public abstract class Poster {

    public final void templateMethod(String title){
        System.out.println("|"+"*".repeat(30)+"|");
        drawImage();
        System.out.println("|"+"*".repeat(30)+"|");
        drawTitle(title);
        System.out.println("|"+"*".repeat(30)+"|");
    }

    public abstract void drawImage();
    public abstract void drawTitle(String title);
}
