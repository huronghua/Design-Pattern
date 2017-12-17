package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;

public class ChocolatePizza extends Pizza {

	PizzaMaterialFactory pizzaMaterialFactory;

	public ChocolatePizza(PizzaMaterialFactory pizzaMaterialFactory) {
		this.pizzaMaterialFactory = pizzaMaterialFactory;
	}

	@Override
	void prepare() {
		cake = pizzaMaterialFactory.createCake();
		cake.print();
		vegetables = pizzaMaterialFactory.createVegetables();
		vegetables.print();
	}
}
