package com.abhinav.exercise.day2.exercise3.observable.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.abhinav.exercise.day2.exercise3.observable.Observable;
import com.abhinav.exercise.day2.exercise3.observer.*;

public class WeatherStation implements Observable{
	private List<WeatherObserver> weatherObservers;
	private int temparature;
	public void setTemparature(int temparature) {
		System.out.println("WeatherStation updating temperature to "+temparature);
		this.temparature = temparature;
		doNotify();
	}

	public WeatherStation(int temparature) {
		weatherObservers=new ArrayList<>();
		this.temparature=temparature;
	}
	
	@Override
	public void addObserver(WeatherObserver weatherObserver) {
		weatherObservers.add(weatherObserver);
		
	}

	@Override
	public void removeObserver(WeatherObserver weatherObserver) {
		weatherObservers.remove(weatherObserver);
		
	}

	@Override
	public void doNotify() {
		Iterator<WeatherObserver> iterator=weatherObservers.iterator();
		while(iterator.hasNext()) {
			WeatherObserver weatherObserver=iterator.next();
			weatherObserver.doUpdate(temparature);
		}
		
	}
}
