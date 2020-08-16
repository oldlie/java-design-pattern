package com.oldlie.learning.java.designparrent.observer;

/**
 * 观察者模式，在被观察者的状态发生变化时，系统基于事件驱动理论将其状态通知到订阅其状态的观察者队形中，以完成状态的修改和事件传播。
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new ConcereteSubject();
        Observer observer = new ConcreteObserver();
        subject.add(observer);
        subject.notifyObserver("data1");
    }
}
