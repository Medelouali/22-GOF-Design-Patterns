package org.example.designPatterns.bridge.resources;

public class ArtistResource implements ResourceImplementor {

    private Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String title() {
        return null;
    }

    @Override
    public String image() {
        return null;
    }

    @Override
    public String snippet() {
        return this.artist.snippet();
    }
}
