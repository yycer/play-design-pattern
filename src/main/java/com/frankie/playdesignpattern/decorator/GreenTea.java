package com.frankie.playdesignpattern.decorator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/31 22:15
 */
public class GreenTea extends Beverage{
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 12.00d;
    }
}
