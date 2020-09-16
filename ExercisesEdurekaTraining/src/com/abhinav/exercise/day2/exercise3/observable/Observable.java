package com.abhinav.exercise.day2.exercise3.observable;

import com.abhinav.exercise.day2.exercise3.observer.WeatherObserver;

public interface Observable {

	public void addObserver(WeatherObserver WO);
	public void removeObserver(WeatherObserver WO);
	public void doNotify();
}
