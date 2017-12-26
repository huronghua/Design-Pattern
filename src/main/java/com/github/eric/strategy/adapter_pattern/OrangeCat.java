package com.github.eric.strategy.adapter_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2017-12-26 14:48
 * @Copyright: 2017 www.banmatrip.com All rights reserved.
 **/
public class OrangeCat implements Cat {

    @Override
    public void miaomiao() {
        System.out.println("orangecat is miaomiaojiao!");
    }

    @Override
    public void catchFish() {
        System.out.println("orangecat can catch fish");
    }
}