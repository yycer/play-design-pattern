package com.frankie.playdesignpattern.decorator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/31 22:15
 */
public class Coffee extends Beverage{
    @Override
    public String getDescription() {
        return "咖啡";
    }

    @Override
    public double cost() {
        return 15.00d;
    }
}
