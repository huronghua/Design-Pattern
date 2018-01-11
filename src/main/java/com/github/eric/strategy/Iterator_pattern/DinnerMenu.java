package com.github.eric.strategy.Iterator_pattern;

/**
 * @author Eric-hu
 * @Description: 菜单对象
 * @create 2018-01-11 16:48
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class DinnerMenu {

    /*菜单对象中需要迭代的成员*/
    MenuItem[] menuItems;

    /*包含一个创建迭代器的方法，来拿到这个具体对象的iterator*/
    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}