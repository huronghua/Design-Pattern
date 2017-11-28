package com.github.eric.strategy.observer_pattern;

public class PublicBoard implements Observer,DisplayElement{

	//该类实现了两个接口，分别重写了两个方法，一个用于更新数据一个用于展示数据
	private Integer tempreture;

	private Integer pressure;

	//private MetaData metaData;此处选择超类，面向超类编程而非面向实现，运行时程序知道调用那个对象的方法

	private Subject subject;

	//构造函数需要超类参数向主题注册订阅
	public PublicBoard(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update(Integer tempreture, Integer pressure) {
		this.pressure = pressure;
		this.tempreture = tempreture;
		display();
	}

	@Override
	public void display() {
		System.out.println("温度："+tempreture + ",压力："+ pressure);
	}

	public static void main(String[] args) {
		MetaData metaData = new MetaData();
		PublicBoard publicBoard = new PublicBoard(metaData);
		metaData.setChangedProperties(100,100);
		metaData.setChangedProperties(200,200);
	}
}
