package com.github.eric.strategy.state_pattern;

/*定义一个状态接口，每个状态都有对应的在这种状态下的四种操作，每个状态都实现这个接口*/
public interface State {

    /*状态可以使用接口也可以使用抽象类，使用抽象类的话就不用新增一个方法就要在所有实现了接口的具体类中实现（或者是不实现）该方法*/

    void insertMoney();

    void returnMoney();

    void pushTheButton();

    void saleGoods();
}
