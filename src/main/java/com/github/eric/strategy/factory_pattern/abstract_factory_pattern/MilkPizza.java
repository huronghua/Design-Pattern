package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;

public class MilkPizza extends Pizza {
	PizzaMaterialFactory pizzaMaterialFactory;

	public MilkPizza(PizzaMaterialFactory pizzaMaterialFactory) {
		this.pizzaMaterialFactory = pizzaMaterialFactory;
	}

	@Override
	void prepare() {
		cake = pizzaMaterialFactory.createCake();
		System.out.println(cake.getName());
		vegetables = pizzaMaterialFactory.createVegetables();
		System.out.println(vegetables.getName());
	}
}
