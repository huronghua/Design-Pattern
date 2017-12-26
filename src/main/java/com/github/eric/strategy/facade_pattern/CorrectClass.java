package com.github.eric.strategy.facade_pattern;

import java.util.Date;

/**
 * @author Eric-hu
 * @Description:
 * @create 2017-12-26 16:55
 * @Copyright: 2017 www.banmatrip.com All rights reserved.
 **/
public class CorrectClass {
    //使用对象内含有的实例的方法
    DVD dvd;

    //可以使用注入进来的方法
    public void paly(Light light){
        Date date = new Date();

        light.on();

        dvd.play();
    }

}