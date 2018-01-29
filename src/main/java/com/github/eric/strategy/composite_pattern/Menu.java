package com.github.eric.strategy.composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 18:18
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class Menu extends MenuComponent {

    ArrayList<MenuComponent> menuItemList = new ArrayList();

    private String name;

    @Override
    public void add(MenuComponent menuComponent) {
        menuItemList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuItemList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuItemList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        /*获取到含有很多菜单项的迭代器，从而遍历打印出菜单里面的菜单项的价格和名字*/
        Iterator iterator = menuItemList.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            System.out.println(menuComponent.getName());
            System.out.println(menuComponent.getPrice());
        }
    }
}