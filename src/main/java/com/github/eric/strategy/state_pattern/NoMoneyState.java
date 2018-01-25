package com.github.eric.strategy.state_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 14:15
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/

/*该状态下所有的行为都是在没钱的前提下发生的*/
public class NoMoneyState implements State {
    GoodsMachine goodsMachine;

    public NoMoneyState(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("您投入了钱");
        goodsMachine.setState(goodsMachine.getHaveMoneyState());
    }

    @Override
    public void returnMoney() {
        System.out.println("您并没有投入钱，所以无法退还");
    }

    @Override
    public void pushTheButton() {
        System.out.println("您按下了按钮，但是您并没有投钱，所以没法购买");
    }

    @Override
    public void saleGoods() {
        System.out.println("您必须先投钱才能购买");
    }
}