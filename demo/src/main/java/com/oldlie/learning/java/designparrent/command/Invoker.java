package com.oldlie.learning.java.designparrent.command;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(String commandMessage) {
        System.out.println("command sending...");
        command.exe(commandMessage);
    }
}
