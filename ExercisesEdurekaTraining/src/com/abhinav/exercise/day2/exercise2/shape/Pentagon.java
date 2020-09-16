package com.abhinav.exercise.day2.exercise2.shape;

import com.abhinav.exercise.day2.exercise2.color.Color;

public class Pentagon extends Shape {

	public Pentagon(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("Pentagon is filled");
		color.applyColor();
		
	}

}
