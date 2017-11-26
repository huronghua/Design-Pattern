package com.github.eric.strategy.strategy_pattern;

public abstract class Duck {

	Quack quack; //不声明为私有，使其可以被继承

	public abstract void display();

	public void fly(){
		System.out.println("所有的鸭子都不会飞");
	}

	public void performQuack(){
		quack.quack();
	}

	public void setQuack(Quack quack){
		this.quack = quack;  //添加的set方法是具体的子类可以在运行时动态改变其行为

	}
}
