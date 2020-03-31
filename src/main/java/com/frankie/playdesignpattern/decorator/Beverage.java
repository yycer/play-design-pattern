package com.frankie.playdesignpattern.decorator;

/**
 * @author: Yao Frankie
 * @date: 2020/3/31 22:13
*/
public abstract class Beverage {

    // 返回描述
    public abstract String getDescription();

    // 返回价格
    public abstract double cost();
}
