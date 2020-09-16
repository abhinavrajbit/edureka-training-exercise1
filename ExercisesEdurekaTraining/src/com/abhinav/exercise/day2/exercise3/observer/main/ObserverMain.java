package com.abhinav.exercise.day2.exercise3.observer.main;

import com.abhinav.exercise.day2.exercise3.observable.impl.WeatherStation;
import com.abhinav.exercise.day2.exercise3.subject.Newspapers;
import com.abhinav.exercise.day2.exercise3.subject.TVChannel;

public class ObserverMain {

	public static void main(String[] args) {
		TVChannel observer1=new TVChannel();
		Newspapers observer2=new Newspapers();
		
		WeatherStation weatherStation=new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		
		weatherStation.setTemparature(30);
		
		weatherStation.removeObserver(observer1);
		
		weatherStation.setTemparature(35);

	}

}
