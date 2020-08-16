package com.oldlie.learning.java.designparrent.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    
    protected List<Observer> observers = new ArrayList<Observer>();

    public void add (Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(String message);
}