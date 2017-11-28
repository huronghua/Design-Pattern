package com.github.eric.strategy.observer_pattern;

public interface Subject {

	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
