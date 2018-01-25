package com.github.eric.strategy.state_pattern;

import lombok.Data;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 14:17
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
/*售货机*/
@Data
public class GoodsMachine {
    /*默认初始的四个状态*/
    State soldOutState;
    State noMoneyState;
    State haveMoneyState;
    State soldState;
    State luckyState;
    /*状态模式可以很轻松的新增状态，而省去了很多判断内部状态的if条件语句*/

    /*初始状态为售完*/
    State state = soldOutState;

    /*用于统计商品剩余数量的变量*/
    int count = 0;

    public GoodsMachine(int count) {
        /*this代表当前类*/
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        haveMoneyState = new HaveMoneyState(this);
        soldState = new SoldState(this);
        this.count = count;

        if(count>0){
            state = noMoneyState;
        }
    }

    public void insertMoney(){
        state.insertMoney();
    }

    public void returnMoney(){
        state.returnMoney();
    }

    public void pushTheButton(){
        state.pushTheButton();
    }

    public void saleGoods(){
        state.saleGoods();
    }

    void releaseGoods(){
        System.out.println("您的商品即将放出");
        if (count != 0) {
            count--;
        }
    }
}