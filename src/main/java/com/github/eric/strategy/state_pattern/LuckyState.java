package com.github.eric.strategy.state_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 16:44
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/

public class LuckyState implements State {
    GoodsMachine goodsMachine;

    public LuckyState(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("您已经投过钱了");
    }

    @Override
    public void returnMoney() {
        System.out.println("您已经按下了按钮，不能退钱了");
    }

    @Override
    public void pushTheButton() {
        System.out.println("您已经按过按钮了，赶紧取出你的商品吧，幸运儿");
    }

    @Override
    public void saleGoods() {
        System.out.println("您的商品即将放出");
        goodsMachine.releaseGoods();
        if(goodsMachine.count>0){
            if(goodsMachine.count>1){
                System.out.println("您是个幸运儿，买一送一");
                goodsMachine.releaseGoods();
                goodsMachine.setState(goodsMachine.getNoMoneyState());

            }else {
                System.out.println("您是个幸运儿，买一送一");
                goodsMachine.releaseGoods();
                goodsMachine.setState(goodsMachine.getSoldOutState());
            }
        }else {
            System.out.println("啊哦，没有货了");
            goodsMachine.setState(goodsMachine.getSoldOutState());
        }

    }
}