package com.github.eric.strategy.Iterator_pattern;

/**
 * @author Eric-hu
 * @Description:
 * @create 2018-01-11 16:21
 * @Copyright: 2018 www.banmatrip.com All rights reserved.
 **/

/*所有的各自的迭代器都实现了Iterator接口，并且提供了各自的向后移位和取下一个元素的实现*/
public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    Integer position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length||items[position]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position+=1;
        return menuItem;
    }


}