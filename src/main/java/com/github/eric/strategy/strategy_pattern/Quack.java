package com.github.eric.strategy.strategy_pattern;

public interface Quack {
	/*面向接口编程，而不是具体的实现*/

	//任何其他类都可以随时实现这个接口具有该接口定义的行为而不需要随时new一个具体类型的实例
	public void quack();
}
