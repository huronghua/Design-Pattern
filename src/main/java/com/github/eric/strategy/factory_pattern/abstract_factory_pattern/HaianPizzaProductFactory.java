package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;


public class HaianPizzaProductFactory extends PizzaProductFactory {


	@Override
	protected Pizza createPizza(String type) {

		Pizza pizza = null;

		PizzaMaterialFactory pizzaMaterialFactory = new HaianPizzaMaterialFactory();

		if("chocolate".equals(type)){
			pizza =	new ChocolatePizza(pizzaMaterialFactory);
			pizza.setName("Haian chocolate pizza");
		}
		else if("milk".equals(type)){
			pizza = new MilkPizza((pizzaMaterialFactory));
			pizza.setName("Haian milk pizza");
		}
		return pizza;
	}
}
