package com.github.eric.strategy.adapter_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2017-12-26 14:45
 * @Copyright: 2017 www.banmatrip.com All rights reserved.
 **/
public class RocketDuck implements Duck {


    @Override
    public void quack() {
        System.out.println("rocketduck is quacking!");
    }

    @Override
    public void fly() {
        System.out.println("rocketduck is flying!");
    }
}