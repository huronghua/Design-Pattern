package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;

//启动调试以查看程序究竟是怎么运行的
public class MainTest {
	public static void main(String[] args) {
		//首先new一个Haian的披萨工厂以解放抽象Pizza工厂的工作
		HaianPizzaProductFactory haianPizzaProductFactory = new HaianPizzaProductFactory();

		//这里的pizza其实是Haian类型的chocolate披萨
		Pizza pizza = haianPizzaProductFactory.orderPizza("chocolate");
		System.out.println("Success ordered pizza:"+ pizza);
	}

	/*与普通工厂模式区别的是：工厂模式采用继承，将实例化的工作交给具体的子类，延迟实例化，抽象工厂模式则采用接口（interface）即组合的形式
	组合出很多的小型工厂，每一个抽象工厂里面的方法都像是一个小型的工厂方法，将具体的实例化工作交给具体类型的子类。*/
}
