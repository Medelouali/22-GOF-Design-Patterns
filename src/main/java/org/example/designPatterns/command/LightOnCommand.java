package org.example.designPatterns.command;

public class LightOnCommand implements Command{
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.turnOn();
    }

    @Override
    public void unexecute() {
        this.lightReceiver.turnOff();
    }
}
