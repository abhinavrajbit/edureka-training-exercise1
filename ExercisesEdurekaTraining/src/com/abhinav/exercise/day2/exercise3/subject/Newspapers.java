package com.abhinav.exercise.day2.exercise3.subject;

import com.abhinav.exercise.day2.exercise3.observer.WeatherObserver;

public class Newspapers implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		System.out.println("Newspapers are updating temperature as "+temperature);
		
	}

}
