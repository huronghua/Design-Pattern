package com.github.eric.strategy.state_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 14:09
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class MainTest {
    public static void main(String[] args) {
        GoodsMachine goodsMachine = new GoodsMachine(5);
        goodsMachine.insertMoney();
        goodsMachine.pushTheButton();
        goodsMachine.saleGoods();
    }
}