package org.example.designPatterns.templateMethod;

public class Test {
    public void run(){
        Poster catPoster=new CatPoster();
        Poster dogPoster=new DogPoster();
        Poster personPoster=new PersonPoster();

        System.out.println("Drawing Cat");
        catPoster.templateMethod("Cool Cat");

        System.out.println("Drawing Dog");
        dogPoster.templateMethod("Cool Dog");

        System.out.println("Drawing Person");
        personPoster.templateMethod("Cool Person");

    }
}
