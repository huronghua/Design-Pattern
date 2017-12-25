package com.github.eric.strategy.singleton_pattern;


public class SynchronizedSingleton {
	//只有第一次需要进行new，后面都是直接返回实例，因为已经有了直接返回
	private static SynchronizedSingleton instance;

	private SynchronizedSingleton() {
	}

	//线程安全的单例，但是每次都要进行同步判断
	public static synchronized SynchronizedSingleton getInstance(){
		if (instance==null){
			instance = new SynchronizedSingleton();
		}
		return instance;
	}
}
