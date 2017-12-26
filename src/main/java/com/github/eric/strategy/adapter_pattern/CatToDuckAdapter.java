package com.github.eric.strategy.adapter_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2017-12-26 14:51
 * @Copyright: 2017 www.banmatrip.com All rights reserved.
 **/
public class CatToDuckAdapter implements Duck {

    //适配器中一般会存在一个被设配对象的实例,并且注入的是猫的超类，面向超类编程
    Cat cat;

    //通过构造函数初始化这个实例
    public CatToDuckAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void quack() {
        cat.miaomiao();
    }

    @Override
    public void fly() {
        System.out.println("猫不会飞（没有fly方法），所以这里假装像火箭鸭一样在飞...");
    }

    /*猫接口中还有一个捕鱼的方法，但是在适配器中只需要实现duck接口的所有方法，不需要实现catchFish方法*/
}