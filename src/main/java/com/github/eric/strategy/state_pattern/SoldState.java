package com.github.eric.strategy.state_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 14:44
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class SoldState implements State {

    GoodsMachine goodsMachine;

    public SoldState(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("请先取出商品，再投入钱");
    }

    @Override
    public void returnMoney() {
        System.out.println("您已经按下了按钮，没法退钱了");
    }

    @Override
    public void pushTheButton() {
        System.out.println("您之前已经按下过按钮了，请尽快取出商品");
    }

    @Override
    /*这个状态比较特殊，需要检查库存是否足够*/
    public void saleGoods() {
        System.out.println("请尽快取出商品");
        goodsMachine.releaseGoods();
        if (goodsMachine.getCount() > 0) {
            goodsMachine.setState(goodsMachine.getNoMoneyState());
        }else {
            goodsMachine.setState(goodsMachine.getSoldOutState());
        }
    }
}