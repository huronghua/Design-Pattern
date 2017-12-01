package com.github.eric.strategy.decorator_pattern;

public abstract class Milk {
	String description = "this is just a normal Milk!";

	public String getDescription(){
		return description;
	}

	public abstract Double cost();
}
