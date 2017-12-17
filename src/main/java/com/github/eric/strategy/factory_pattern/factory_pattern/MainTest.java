package com.github.eric.strategy.factory_pattern.factory_pattern;

public class MainTest {
	public static void main(String[] args) {
		HaianPizzaProductFactory haianPizzaStore = new HaianPizzaProductFactory();
		Pizza pizza = haianPizzaStore.orderPizza("chocolate");
		System.out.println("Success ordered a pizza :"+ pizza.getName());
	}
}
