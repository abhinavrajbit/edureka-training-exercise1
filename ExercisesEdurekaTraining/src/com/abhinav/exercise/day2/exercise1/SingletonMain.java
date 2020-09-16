package com.abhinav.exercise.day2.exercise1;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1 = Singleton.getInstance();
		
	 System.out.println(s1);
	
	Singleton s2 = Singleton.getInstance();
		
		System.out.println("The hash code of singleton are same : " + s2.hashCode() +"  "+ s1.hashCode());

	}

}
