package com.oldlie.learning.java.designparrent.strategy;

public class Context {

    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return this.travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelMode() {
        this.travelStrategy.travelMode();
    }
}
