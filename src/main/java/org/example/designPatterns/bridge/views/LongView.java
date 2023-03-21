package org.example.designPatterns.bridge.views;

import org.example.designPatterns.bridge.resources.ResourceImplementor;
import org.example.designPatterns.bridge.views.SpotifyView;

public class LongView extends SpotifyView {

    public LongView(ResourceImplementor resourceImplementor) {
        this.resourceImplementor=resourceImplementor;
    }

    @Override
    public String showView() {
        return "LongView Of {\n\t"+this.resourceImplementor.snippet()+"\n}";
    }
}
