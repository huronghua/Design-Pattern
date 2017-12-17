package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;

public class HaianPizzaMaterialFactory implements PizzaMaterialFactory {
	@Override
	public Cake createCake() {
		//这里就是子类具体实现工厂方法的地方，创建一个Haian制作的cake
		return new HaianCake();
	}

	@Override
	public Vegetables createVegetables() {
		return new HaianVegetables();
	}
}
