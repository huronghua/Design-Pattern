package com.github.eric.strategy.state_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 14:48
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class SoldOutState implements State {

    GoodsMachine goodsMachine;

    public SoldOutState(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("糖果售罄了，不支持的操作");
    }

    @Override
    public void returnMoney() {
        System.out.println("糖果售罄了，不支持的操作");
    }

    @Override
    public void pushTheButton() {
        System.out.println("糖果售罄了，不支持的操作");
    }

    @Override
    public void saleGoods() {
        System.out.println("糖果售罄了，不支持的操作");
    }
}