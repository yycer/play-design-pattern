package com.frankie.playdesignpattern;

import com.frankie.playdesignpattern.decorator.Beverage;
import com.frankie.playdesignpattern.decorator.BlackTea;
import com.frankie.playdesignpattern.decorator.Lemon;
import com.frankie.playdesignpattern.decorator.MilkFoam;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Yao Frankie
 * @date: 2020/3/31 22:22
 */
@SpringBootTest
public class DecoratorTest {

    @Test
    void beverageTest(){
        Beverage beverage = new BlackTea();
        beverage = new Lemon(beverage);
        beverage = new MilkFoam(beverage);

        System.out.println(beverage.getDescription() + "; 价格: " + beverage.cost());
    }
}
