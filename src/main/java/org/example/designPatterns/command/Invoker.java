package org.example.designPatterns.command;

public class Invoker {
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command turnUpCommand;
    private Command turnDownCommand;

    public Invoker(Command turnOnCommand, Command turnOffCommand, Command turnUpCommand, Command turnDownCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
        this.turnUpCommand = turnUpCommand;
        this.turnDownCommand = turnDownCommand;
    }

    public void turnOffLight(){
        this.turnOffCommand.execute();
    }

    public void turnOnLight(){
        this.turnOnCommand.execute();
    }

    public void turnUpLight(){
        this.turnUpCommand.execute();
    }

    public void turnDownLight(){
        this.turnDownCommand.execute();
    }

    public void toggle(){
        this.turnDownCommand.unexecute();
        this.turnUpCommand.unexecute();
        this.turnOffCommand.unexecute();
        this.turnOnCommand.unexecute();
    }
}
