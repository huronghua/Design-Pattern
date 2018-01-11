package com.github.eric.strategy.template_method_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-11 14:46
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class Tea extends Drink {
    @Override
    void brew() {
        System.out.println("浸泡茶叶");
    }

    @Override
    void addCondiments() {
        System.out.println("加入少许茶多酚");
    }
}