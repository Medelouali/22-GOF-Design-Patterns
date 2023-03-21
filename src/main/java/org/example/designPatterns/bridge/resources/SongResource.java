package org.example.designPatterns.bridge.resources;

public class SongResource implements ResourceImplementor {
    private Song song;

    public SongResource(Song song) {
        this.song = song;
    }

    @Override
    public String title() {
        return this.song.getTitle();
    }

    @Override
    public String image() {
        return null;
    }

    @Override
    public String snippet() {
        return this.song.snippet();
    }
}
