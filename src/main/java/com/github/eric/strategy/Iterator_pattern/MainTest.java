package com.github.eric.strategy.Iterator_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-11 17:07
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class MainTest {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(dinnerMenu);
        waitress.printMenu();


    }
}