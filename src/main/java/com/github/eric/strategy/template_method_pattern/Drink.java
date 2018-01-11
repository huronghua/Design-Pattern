package com.github.eric.strategy.template_method_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-11 14:29
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public abstract class Drink {

    /*prepareDrink是一个模板方法，声明为final来避免被子类所更改，定义了一些算法步骤，并且通过声明为abstract来允许子类加入一些自己特殊的实现*/
    final void prepareDrink(){
        /*调配任何饮料都必须具有的方法*/
        boilWater();

        /*有点差异但是可以抽象出来的方法*/
        brew();

        /*任何饮料都必须具有的方法*/
        pourInCup();

        /*子类操作略有不同的方法，但是都是加调料，加的调料不同而已*/
        if(hook()){
            /*只有在钩子输出满足条件的情况下，才执行这个方法*/
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("烧水");
    }

    void pourInCup(){
        System.out.println("倒进杯子里");
    }

    boolean hook(){
        /*钩子方法，默认什么都不做，也可以提供一个默认的实现
        * 这个方法可以用于子类对既定的算法族进行细节性的定义和修改*/
        return true;
    }
}