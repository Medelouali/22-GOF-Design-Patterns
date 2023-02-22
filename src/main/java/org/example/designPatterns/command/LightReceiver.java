package org.example.designPatterns.command;

public class LightReceiver {
    private boolean isLightOn;
    private boolean isLightOff;
    private boolean isLightUp;
    private boolean isLightDown;

    public LightReceiver() {
        this.isLightOn = false;
        this.isLightOff = false;
        this.isLightUp = false;
        this.isLightDown = false;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public void setLightOn(boolean lightOn) {
        isLightOn = lightOn;
    }

    public boolean isLightOff() {
        return isLightOff;
    }

    public void setLightOff(boolean lightOff) {
        isLightOff = lightOff;
    }

    public boolean isLightUp() {
        return isLightUp;
    }

    public void setLightUp(boolean lightUp) {
        isLightUp = lightUp;
    }

    public boolean isLightDown() {
        return isLightDown;
    }

    public void setLightDown(boolean lightDown) {
        isLightDown = lightDown;
    }

    public void turnOn(){
        this.setLightOn(true);
        this.setLightOff(false);
    }

    public void turnOff(){
        this.setLightOn(false);
        this.setLightOff(true);
    }

    void turnDown(){
        this.setLightDown(true);
        this.setLightUp(false);
    }

    void turnUp(){
        this.setLightDown(false);
        this.setLightUp(true);
    }

    @Override
    public String toString() {
        return "LightReceiver[\n" +
                "\tisLightOn=" + isLightOn +
                ",\n\tisLightOff=" + isLightOff +
                ",\n\tisLightUp=" + isLightUp +
                ",\n\tisLightDown=" + isLightDown +
                "\n]";
    }
}
