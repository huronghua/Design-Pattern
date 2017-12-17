package com.github.eric.strategy.factory_pattern.factory_pattern;

import lombok.Data;

@Data
//声明为抽象类，并且具有一些共性的Pizza都有的属性和方法
public abstract class Pizza {
	String name;
	String cake;
	String vegetables;

	public void prepare(){
		System.out.println("Preparing:"+name);
		System.out.println("Making cake....");
		System.out.println("Adding some vegetables.");
	}

	public void bake(){
		System.out.println("Bake for 25 minutes.");
	}

	public void cut(){
		System.out.println("Cut for boxing.");
	}
}
