package com.abhinav.exercise.day2.exercise2.Main;

import com.abhinav.exercise.day2.exercise2.color.Green;
import com.abhinav.exercise.day2.exercise2.color.Red;
import com.abhinav.exercise.day2.exercise2.shape.Circle;
import com.abhinav.exercise.day2.exercise2.shape.Pentagon;
import com.abhinav.exercise.day2.exercise2.shape.Shape;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(new Red());
		circle.applyColor();
		
		Shape penta = new Pentagon(new Green());
		penta.applyColor();

	}

}
