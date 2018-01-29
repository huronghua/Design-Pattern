package com.github.eric.strategy.composite_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 18:38
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class Waitress {

    MenuComponent menuComponent;

    public Waitress(MenuComponent peakMenuComponent) {
        this.menuComponent = peakMenuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }
}