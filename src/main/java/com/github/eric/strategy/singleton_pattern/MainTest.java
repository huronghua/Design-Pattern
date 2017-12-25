package com.github.eric.strategy.singleton_pattern;

public class MainTest {

	public static void main(String[] args) {
		//getinstance方法为static直接类调用获取实例
		SynchronizedSingleton.getInstance();

	}
}
