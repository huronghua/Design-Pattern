package com.github.eric.strategy.state_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 14:35
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class HaveMoneyState implements State {
    GoodsMachine goodsMachine;

    public HaveMoneyState(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("您已经投过钱了");
    }

    @Override
    public void returnMoney() {
        System.out.println("请及时取出退还给您的钱");
        goodsMachine.setState(goodsMachine.getNoMoneyState());
    }

    @Override
    public void pushTheButton() {
        System.out.println("您按下了按钮，请及时取出您的商品");
        goodsMachine.setState(goodsMachine.getSoldState());
    }

    @Override
    public void saleGoods() {
        System.out.println("确认购买商品请先按下按钮");
    }
}