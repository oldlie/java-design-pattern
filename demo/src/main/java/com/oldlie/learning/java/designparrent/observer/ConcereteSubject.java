package com.oldlie.learning.java.designparrent.observer;

public class ConcereteSubject extends Subject {

    public void notifyObserver(String message) {
        for (Object obs : observers) {
            System.out.println("notify observer " + message + " change ...");
            ((Observer) obs).dataChange(message);
        }
    }
}