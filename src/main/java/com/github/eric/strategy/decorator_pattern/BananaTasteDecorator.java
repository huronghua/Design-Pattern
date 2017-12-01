package com.github.eric.strategy.decorator_pattern;

public class BananaTasteDecorator extends TasteDecorator {
	//必须注入组件的实例
	Milk milk;

	//构造函数用于将超类存储起来，装饰者拥有和超类组件一样的类型
	public BananaTasteDecorator(Milk milk) {
		this.milk = milk;
	}

	@Override
	public String getDescription() {
		return milk.getDescription() + "and taste is banana.";
	}

	@Override
	public Double cost() {
		return milk.cost()+1.0;
	}
}
