package com.github.eric.strategy.facade_pattern;

/**
 * @author Eric-hu
 * @Description:外观模式遵循最少知识原则，让更少的对象参与到本类中来
 * @create 2017-12-26 16:06
 * @Copyright: 2017 www.banmatrip.com All rights reserved.
 **/
public class MainTest {
    public static void main(String[] args) {

        Light light = new Light();

        DVD dvd = new DVD();

        FamilyTheaterFacade familyTheaterFacade = new FamilyTheaterFacade(light,dvd);

        //原本需要调用多个方法被精简为只需要一个方法
        familyTheaterFacade.watchMovie();

        familyTheaterFacade.endMovie();
    }
}