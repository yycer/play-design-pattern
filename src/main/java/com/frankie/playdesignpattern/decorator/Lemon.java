package com.frankie.playdesignpattern.decorator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/31 22:18
 */
public class Lemon extends Condiment {

    private Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 加柠檬";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2; // 加柠檬需要2元
    }
}
