package com.frankie.playdesignpattern.decorator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/31 22:19
 */
public class MilkFoam extends Condiment {

    private Beverage beverage;

    public MilkFoam(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 加奶盖";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5; // 加柠檬需要5元
    }
}
