package com.github.eric.strategy.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class MetaData implements Subject {

	private List<Observer> observerList = new ArrayList<>();//此处必须先初始化以避免null指针异常

	private Integer tempreture;

	private Integer pressure;

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		Integer i = observerList.indexOf(observer);
		if(i>0){
			observerList.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observerList){
			observer.update(tempreture,pressure);
		}
	}

	public void propertiesChanged(){
		notifyObservers();
	}

	public void setChangedProperties(Integer tempreture,Integer pressure){
		this.tempreture = tempreture;
		this.pressure = pressure;
		propertiesChanged();
	}
}
