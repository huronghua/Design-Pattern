package com.github.eric.strategy.composite_pattern;

import lombok.Data;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-25 18:13
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/

public class MenuItem extends MenuComponent {
    private String name;

    private String price;

    public MenuItem(String name, String price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public void print(){
        System.out.println(getName());

        System.out.println(getPrice());
    }

}