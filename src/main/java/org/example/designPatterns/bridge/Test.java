package org.example.designPatterns.bridge;

import org.example.designPatterns.bridge.resources.*;
import org.example.designPatterns.bridge.views.LongView;
import org.example.designPatterns.bridge.views.ShortView;

public class Test {

    public void run(){
        SongResource songResource=new SongResource(new Song("What Do You Mean", "What do you mean? Oh, oh, When you nod your head yes But you wanna say no"));
        PodcastResource podcastResource=new PodcastResource(new Podcast("Modern Life", "Tate", "JK", "Gotta work to build your life"));
        ArtistResource artistResource=new ArtistResource(new Artist("Justin B", 3.4, "No Clue"));

        LongView longViewSong=new LongView(songResource);
        LongView longViewPodcast=new LongView(podcastResource);
        LongView longViewArtist=new LongView(artistResource);

        ShortView shortViewSong=new ShortView(songResource);
        ShortView shortViewPodcast=new ShortView(podcastResource);
        ShortView shortViewArtist=new ShortView(artistResource);

        System.out.println("------Tests(Long Views)----");
        System.out.println(longViewSong.showView());
        System.out.println(longViewPodcast.showView());
        System.out.println(longViewArtist.showView());

        System.out.println("------Tests(Short Views)----");
        System.out.println(shortViewSong.showView());
        System.out.println(shortViewPodcast.showView());
        System.out.println(shortViewArtist.showView());
    }
}
