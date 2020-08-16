package com.oldlie.learning.java.designparrent.strategy;

/**
 * 通过实现不同的策略，并在上下文中指定策略来替代使用if-else
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context();

        TravelByAirStrategy travelByAirStrategy = new TravelByAirStrategy();
        context.setTravelStrategy(travelByAirStrategy);
        context.travelMode();

        TravelByCarStrategy travelByCarStrategy = new TravelByCarStrategy();
        context.setTravelStrategy(travelByCarStrategy);
        context.travelMode();
    }
}
