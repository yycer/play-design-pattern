package com.frankie.playdesignpattern.decorator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/31 22:15
 */
public class BlackTea extends Beverage{
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10.00d;
    }
}
