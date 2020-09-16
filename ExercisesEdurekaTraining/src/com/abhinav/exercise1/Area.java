package com.abhinav.exercise1;

public class Area {
	int l,b;
	int edge;
	double r;
	public Area(int l, int b) {
	 this.l=l;
	 this.b=b;
	}
	
	public Area(int edge) {
		this.edge=edge;
	}
	public Area(double r) {
		this.r=r;
	}
	
	public  int rectArea() {
		return l*b;
	}
	public int sqArea() {
		return edge*edge;
	}
	
	public double circleArea() {
		return (r*r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area rectangleArea = new Area(10,12);
			System.out.println("Rectangle area is "  + rectangleArea.rectArea());

			Area squareArea = new Area(10);
			System.out.println("Square area is " + squareArea.sqArea());

			Area circleArea = new Area(2.5);
			System.out.println("Circle area is " + circleArea.circleArea());

	}

}
