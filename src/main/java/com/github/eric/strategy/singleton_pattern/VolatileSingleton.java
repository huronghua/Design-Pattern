package com.github.eric.strategy.singleton_pattern;

//对于性能有要求的单例采用此种方式
public class VolatileSingleton {
	//添加volatile使instance对于进程可见
	private volatile static VolatileSingleton instance;

	private VolatileSingleton(){

	}

	public static VolatileSingleton getInstance(){
		//一次检查，实例没有创建再进入同步区块，避免每次都进行同步，降低程序性能
		if (null == instance){
			synchronized (VolatileSingleton.class){
				//二次检查，执行之前的步骤，如果不存在才进行创建，且只有第一次才会执行到此区块，后面都是直接返回
				if (null == instance){
					instance = new VolatileSingleton();
				}
			}
		}
		return instance;
	}
}
