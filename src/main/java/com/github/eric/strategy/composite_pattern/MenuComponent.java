package com.github.eric.strategy.composite_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 18:08
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/

/*组合模式，定义为抽象类，这样子类可以选择性的实现对自己有用的方法，也可以选择默认的实现*/
public abstract class MenuComponent {

    /*提供一个组件，里面包含了菜单项和菜单的混合方法，并且定义为抽象类，模糊了对象的具体类型*/

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getPrice(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}