package com.github.eric.strategy.strategy_pattern;

public class QuackWithNoWords implements Quack {
	@Override
	public void quack() {
		System.out.println("所有的鸭子默认都只会呱呱叫");
	}
}
