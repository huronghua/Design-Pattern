package com.github.eric.strategy.factory_pattern.factory_pattern;


//这里的PizzaStore即运用了工厂模式，创建具体对象的任务交给了它的工厂方法createPizza,必须声明为abstract
public abstract class PizzaProductFactory {
	//声明一个工厂方法，返回值为超类类型，由于是abstract所以必须被子类实现
	protected abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type){
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();

		return pizza;
	}
}
