package com.github.eric.strategy.decorator_pattern;

public class GuangMingMilk extends Milk {

	@Override
	public String getDescription() {
		return "this Milk is processed by guangming company on the basic of normal Milk!";
	}

	@Override
	public Double cost() {
		return 15.0;
	}
}
