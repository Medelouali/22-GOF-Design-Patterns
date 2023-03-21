package org.example.designPatterns.bridge.views;

import org.example.designPatterns.bridge.resources.ResourceImplementor;

public abstract class SpotifyView {
    protected ResourceImplementor resourceImplementor;
    public abstract String showView();
}
