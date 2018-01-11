package com.github.eric.strategy.template_method_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-11 14:49
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class MainTest {
    /*通过调用模板方法prepareDrink来执行该方法内部的算法族
    * 本质上有模板方法控制了执行步骤，并且抽象复用了公共的 部分*/
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareDrink();
        Coffee coffee = new Coffee();
        coffee.prepareDrink();
    }
}