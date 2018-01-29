package com.github.eric.strategy.composite_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 18:35
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class MainTest {

    public static void main(String[] args) {
        /*最上层的菜单*/
        MenuComponent peakMenu = new Menu();

        /*这个其实只有一个菜单项*/
        MenuComponent dinnerMenu = new MenuItem("晚饭","16");

        /*这是一个甜点菜单组合，包含很多菜单项*/
        MenuComponent dessertMenu = new Menu();

        MenuComponent salaMenu = new Menu();

        MenuComponent cakeMenu = new Menu();


        /*将甜点菜单组合构造完毕*/
        dessertMenu.add(salaMenu);
        dessertMenu.add(cakeMenu);

        /*将所有菜单和菜单项添加到最顶层的菜单*/
        peakMenu.add(dinnerMenu);

        peakMenu.add(dessertMenu);

        Waitress waitress = new Waitress(peakMenu);

        /*直接调用服务员的打印方法，就能答应出不管是菜单还是菜单项的信息*/
        waitress.printMenu();

    }
}