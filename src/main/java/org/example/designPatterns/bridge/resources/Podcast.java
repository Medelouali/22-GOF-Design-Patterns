package org.example.designPatterns.bridge.resources;

public class Podcast {
    private String title;
    private String guestName;
    private String hostName;
    private String description;

    public Podcast(String title, String guestName, String hostName, String description) {
        this.title = title;
        this.guestName = guestName;
        this.hostName = hostName;
        this.description = description;
    }

    public String snippet(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "title='" + title + '\'' +
                ", guestName='" + guestName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
