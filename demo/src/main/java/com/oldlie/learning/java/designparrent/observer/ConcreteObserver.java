package com.oldlie.learning.java.designparrent.observer;

public class ConcreteObserver implements Observer {
    
    @Override
    public void dataChange(String message) {
        System.out.println("receive message:" + message);
    }
}