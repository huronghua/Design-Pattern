package com.github.eric.strategy.Iterator_pattern;

import com.google.gson.Gson;

/**
 * @author Eric-hu
 * @Description: 服务员类
 * @create 2018-01-11 16:59
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/
public class Waitress {
    DinnerMenu dinnerMenu;

    Gson gson = new Gson();

    public Waitress(DinnerMenu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator iterator = dinnerMenu.createIterator();
        /*重载printMenu方法，方便直接在test类中调用*/
        printMenu(iterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(gson.toJson(iterator.next()));
        }
    }
}
