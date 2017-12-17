package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;

/**
 * 声明为interface，区别于工厂方法，该工厂用于创建制作pizza的原材料
 */
public interface PizzaMaterialFactory {
	//看起来是一个小型的工厂方法，具体的实例化创建cake的工作交给具体的子类来完成（这里就是指HaianPizzaMaterianlFactory子类）
	public Cake createCake();

	public Vegetables createVegetables();
}
