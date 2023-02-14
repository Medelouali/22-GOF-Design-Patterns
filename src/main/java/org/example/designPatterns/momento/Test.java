package org.example.designPatterns.momento;

public class Test {


    public void run(){
        CareTaker history=new CareTaker();
        Originator editor=new Originator();

        editor.setArticle("A");
        history.push(editor.createState());

        editor.setArticle("B");
        history.push(editor.createState());

        editor.setArticle("C");
        history.push(editor.createState());

        editor.restore(history.pop());
        System.out.println("Current State after undo:\t"+editor.getArticle());

        editor.restore(history.pop());
        System.out.println("Current State after another undo:\t"+editor.getArticle());
    }
}
