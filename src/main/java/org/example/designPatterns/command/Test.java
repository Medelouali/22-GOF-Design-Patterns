package org.example.designPatterns.command;

public class Test {

    public void run(){
        //Receiver Object
        LightReceiver lightReceiver =new LightReceiver();

        //Commands that will act on the receiver object
        Command onCommand=new LightOnCommand(lightReceiver);
        Command offCommand=new LightOffCommand(lightReceiver);
        Command upCommand=new LightUpCommand(lightReceiver);
        Command downCommand=new LightDownCommand(lightReceiver);

        //Initialize the invoker
        Invoker remoteControl=new Invoker(onCommand, offCommand, upCommand, downCommand);
        System.out.println("---Tests---");

        System.out.println("1-Initially");
        System.out.println(lightReceiver);

        remoteControl.turnOnLight();
        System.out.println("2-Turning On");
        System.out.println(lightReceiver);

        remoteControl.turnDownLight();
        System.out.println("3-Turning Down");
        System.out.println(lightReceiver);

        remoteControl.turnUpLight();
        System.out.println("4-Turning Up");
        System.out.println(lightReceiver);

        remoteControl.turnOffLight();
        System.out.println("5-Turning Off");
        System.out.println(lightReceiver);
        System.out.println("---Tests Ended---");
    }
}
