package org.example.designPatterns.momento;

public class Originator {
    public String getArticle() {
        return article;
    }

    private String article;

    public void setArticle(String article) {
        this.article = article;
    }

    public Momento createState(){
        return new Momento(this.article);
    }

    public void restore(Momento momento){
        this.article= momento.getArticle();
    }
}
