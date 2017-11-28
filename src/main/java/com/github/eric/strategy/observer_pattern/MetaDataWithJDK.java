package com.github.eric.strategy.observer_pattern;

import lombok.Data;

import java.util.Observable;


@Data
public class MetaDataWithJDK extends Observable {
	private Integer tempreture;

	private Integer pressure;

	public void propertiesChanged(){
		setChanged();
		notifyObservers();
		//notifyObservers(Object args);表示主题主动向订阅者推送通知（args为任意类型的对象数据）
	}
	public void setChangedProperties(Integer tempreture,Integer pressure){
		this.tempreture = tempreture;
		this.pressure = pressure;
		propertiesChanged();
	}

}
