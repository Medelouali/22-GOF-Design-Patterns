package org.example.designPatterns.bridge.resources;

public class Artist {
    private String name;
    private double rating;
    private String description;


    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }

    public String snippet(){
        return this.toString();
    }

    public Artist(String name, double rating, String description) {
        this.name = name;
        this.rating = rating;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
