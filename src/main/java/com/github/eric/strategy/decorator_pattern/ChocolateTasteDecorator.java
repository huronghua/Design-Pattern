package com.github.eric.strategy.decorator_pattern;

public class ChocolateTasteDecorator extends Milk {

	Milk milk;

	public ChocolateTasteDecorator(Milk milk) {
		this.milk = milk;
	}

	@Override
	public String getDescription() {
		return milk.getDescription()+"and taste is chocolate.";
	}

	@Override
	public Double cost() {
		return milk.cost()+2.0;
	}
}
