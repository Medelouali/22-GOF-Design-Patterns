package org.example.designPatterns.bridge.views;

import org.example.designPatterns.bridge.resources.ResourceImplementor;
import org.example.designPatterns.bridge.views.SpotifyView;

public class ShortView extends SpotifyView {


    public ShortView(ResourceImplementor resourceImplementor) {
        this.resourceImplementor=resourceImplementor;
    }

    @Override
    public String showView() {
        return "ShortView Of {\n\t"+this.resourceImplementor.snippet()+"\n}";
    }
}
