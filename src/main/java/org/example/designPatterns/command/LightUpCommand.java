package org.example.designPatterns.command;

public class LightUpCommand implements Command{
    private LightReceiver lightReceiver;

    public LightUpCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.turnUp();
    }

    @Override
    public void unexecute() {
        this.lightReceiver.turnDown();
    }
}
