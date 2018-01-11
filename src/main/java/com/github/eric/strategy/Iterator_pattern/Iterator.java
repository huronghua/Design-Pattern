package com.github.eric.strategy.Iterator_pattern;


/*迭代器模式构造了一个接口使得所有的遍历对象成员的工作从对象本身移到了专门的对应的iterator上
* 由具体的iterator实现类来实现具体的迭代操作，而调用者本身不需要关注遍历的细节*/
public interface Iterator {

    boolean hasNext();

    Object next();
}
