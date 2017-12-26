package com.github.eric.strategy.facade_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2017-12-26 16:03
 * @Copyright: 2017 www.banmatrip.com All rights reserved.
 **/
public class FamilyTheaterFacade {

    Light light;
    DVD dvd;

    public FamilyTheaterFacade(Light light, DVD dvd) {
        this.light = light;
        this.dvd = dvd;
    }

    public void watchMovie(){
        light.on();
        dvd.play();
    }

    public void endMovie(){
        dvd.pause();
        light.off();
    }
}