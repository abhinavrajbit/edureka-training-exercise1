package com.abhinav.exercise1;

public class Student {
	int id;
	 String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("The ID is : " + id + " and the name is : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Abhinav");
		Student s2 = new Student(2,"Raj");
		s1.display();
		s2.display();
		
		

	}

}
