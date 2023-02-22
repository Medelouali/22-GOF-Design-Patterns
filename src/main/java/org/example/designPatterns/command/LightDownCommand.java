package org.example.designPatterns.command;

public class LightDownCommand implements Command{
    private LightReceiver lightReceiver;

    public LightDownCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.turnDown();
    }

    @Override
    public void unexecute() {
        this.lightReceiver.turnUp();
    }
}
