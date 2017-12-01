package com.github.eric.strategy.decorator_pattern;

public class MainTest {

	public static void main(String[] args) {
		//实例化一个具体组件实例，面向超类编程
		Milk milk = new YiliMilk();

		//套了一层香蕉味装饰者
		milk = new BananaTasteDecorator(milk);
		//在香蕉味的基础上又套了一层巧克力味装饰者(价格在此基础上再加上之前的价格)

		milk = new ChocolateTasteDecorator(milk);

		System.out.println(milk.getDescription());

		//有一点需要说明的是所有的装饰者都属于milk超类类型
		System.out.println("最终的价格是:" + milk.cost());
	}
}
