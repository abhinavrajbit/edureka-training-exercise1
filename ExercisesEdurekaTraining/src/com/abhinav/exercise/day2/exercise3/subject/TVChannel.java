package com.abhinav.exercise.day2.exercise3.subject;

import com.abhinav.exercise.day2.exercise3.observer.WeatherObserver;

public class TVChannel implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("TV Channel updating temperature as "+temperature);
		

	}

}
