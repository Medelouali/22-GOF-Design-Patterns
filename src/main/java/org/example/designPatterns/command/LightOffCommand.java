package org.example.designPatterns.command;

public class LightOffCommand implements Command{
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.turnOff();
    }

    @Override
    public void unexecute() {
        this.lightReceiver.turnOn();
    }
}
