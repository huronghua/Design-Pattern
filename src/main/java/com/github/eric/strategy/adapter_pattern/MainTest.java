package com.github.eric.strategy.adapter_pattern;

/**
 * @author Eric-hu
 * @Description:适配器改写的一定是一个接口，使其能够适应最终所需要的接口
 * @create 2017-12-26 15:35
 * @Copyright: 2017 www.banmatrip.com All rights reserved.
 **/
public class MainTest {

    public static void main(String[] args) {
        OrangeCat orangeCat = new OrangeCat();

        //适配器实现了Duck接口，所以本质上也是一只duck，这里看上去是适配器在调用
        Duck catToDuckAdapter = new CatToDuckAdapter(orangeCat);
        System.out.println("下面有请假的鸭子--橘猫进行他的表演：");
        catToDuckAdapter.quack();
        catToDuckAdapter.fly();
    }
}