package com.oldlie.learning.java.designparrent.chainofresponsibility;

public class AuthHandler extends AbstractHandler implements Handler {

    private String name;

    public AuthHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("user auth...");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
