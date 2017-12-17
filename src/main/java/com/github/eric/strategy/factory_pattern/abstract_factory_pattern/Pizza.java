package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;

import lombok.Data;

@Data
//声明为抽象类，并且具有一些共性的Pizza都有的属性和方法
public abstract class Pizza {
	String name;
	Cake cake;
	Vegetables vegetables;

	//区别于工厂模式，这里将prepare方法声明为抽象方法，用于准备Pizza所需要的原材料
	abstract void prepare();

	void bake(){
		System.out.println("Bake for 25 minutes.");
	}

	void cut(){
		System.out.println("Cut for boxing.");
	}
}
