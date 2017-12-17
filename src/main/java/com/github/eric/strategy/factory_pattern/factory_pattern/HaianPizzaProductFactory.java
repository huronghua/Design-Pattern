package com.github.eric.strategy.factory_pattern.factory_pattern;

public class HaianPizzaProductFactory extends PizzaProductFactory {

	//作为PizzaStore的一个示例实现createPizzafangfa方法，以负责具体的实例化工作
	@Override
	protected Pizza createPizza(String type) {
		if("chocolate".equals(type)){
			return new HaianChocolatePizza();
		}else if("milk".equals(type)) {
			return new HaianMilkPizza();
		}else {
			return null;
		}
	}

}