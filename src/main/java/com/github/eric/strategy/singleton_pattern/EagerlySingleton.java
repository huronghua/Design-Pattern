package com.github.eric.strategy.singleton_pattern;

public class EagerlySingleton {
	//急切创建单例,jvm在加载类的时候就立即创建实例，保证了线程访问前实例已经被创建
	private static EagerlySingleton instance = new EagerlySingleton();

	private EagerlySingleton(){

	}

	public static EagerlySingleton getInstance(){
		//仅仅开放给外界一个获取实例的入口，因为类加载时实例就已经创建，所以直接返回
		return instance;
	}
}
