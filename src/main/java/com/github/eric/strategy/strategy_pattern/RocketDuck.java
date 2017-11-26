package com.github.eric.strategy.strategy_pattern;

public class RocketDuck extends Duck {

	public RocketDuck() {
		quack = new QuackWithNoWords();//因为继承所有的鸭子都具有quck行为
	}

	@Override
	public void display() {

	}

	public static void main(String[] args) {
		Duck duck = new RocketDuck();
		duck.performQuack();
		duck.setQuack(new QuackWithGuaGua());
		duck.fly();
		duck.performQuack(); //可以动态改变鸭子叫的行为
	}
}



