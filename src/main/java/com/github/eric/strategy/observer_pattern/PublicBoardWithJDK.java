package com.github.eric.strategy.observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class PublicBoardWithJDK implements Observer,DisplayElement {

	private Observable observable;

	private Integer tempreture;

	private Integer pressure;

	public PublicBoardWithJDK(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);//此处必须向主题进行注册，才会被通知
	}

	@Override
	//面向超类编程，接口参数为超类
	public void update(Observable o, Object arg) {
		if(o instanceof MetaDataWithJDK){
			//如果是MetaData类型的才会进行展示
			MetaDataWithJDK metaDataWithJDK = (MetaDataWithJDK) o;
			this.pressure = metaDataWithJDK.getPressure();
			this.tempreture = metaDataWithJDK.getTempreture();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("温度："+tempreture + ",压力："+ pressure);
	}

	public static void main(String[] args) {
		MetaDataWithJDK metaDataWithJDK = new MetaDataWithJDK();
		PublicBoardWithJDK publicBoard = new PublicBoardWithJDK(metaDataWithJDK);
		metaDataWithJDK.setChangedProperties(100,100);
		metaDataWithJDK.setChangedProperties(200,200);
	}
}
