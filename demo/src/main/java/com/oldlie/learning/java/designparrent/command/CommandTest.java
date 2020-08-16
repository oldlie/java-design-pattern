package com.oldlie.learning.java.designparrent.command;

/**
 * 命令模式，这个模式主要是通过command类来隔离接受者和调用者。目的还是
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command cmd = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(cmd);
        invoker.action("command1");
    }
}
