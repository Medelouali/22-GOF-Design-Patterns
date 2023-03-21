package org.example.designPatterns.bridge.resources;

public class PodcastResource implements ResourceImplementor {
    private Podcast podcast;

    public PodcastResource(Podcast podcast) {
        this.podcast = podcast;
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
        return this.podcast.snippet();
    }
}
