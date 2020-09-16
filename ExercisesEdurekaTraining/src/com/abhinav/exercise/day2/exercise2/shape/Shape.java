package com.abhinav.exercise.day2.exercise2.shape;

import com.abhinav.exercise.day2.exercise2.color.Color;

public abstract class Shape {
	protected Color color;
	
	public Shape(Color color) {
		this.color=color;
	}
	
	abstract public void applyColor();

}
