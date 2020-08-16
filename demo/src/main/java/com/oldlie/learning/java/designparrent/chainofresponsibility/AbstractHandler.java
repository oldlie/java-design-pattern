package com.oldlie.learning.java.designparrent.chainofresponsibility;

public abstract class AbstractHandler {
    protected Handler handler;

    protected Handler getHandler() {
        return handler;
    }

    protected void setHandler(Handler handler) {
        this.handler = handler;
    }
}
