package com.github.eric.strategy.decorator_pattern;

public class YiliMilk extends Milk {
	public YiliMilk() {
		description = "this Milk is processed by yili company on the basic of normal Milk!";
	}

	@Override
	public String getDescription() {
		return "this Milk is processed by yili company on the basic of normal Milk!";
	}

	@Override
	public Double cost() {
		return 10.0;
	}
}
