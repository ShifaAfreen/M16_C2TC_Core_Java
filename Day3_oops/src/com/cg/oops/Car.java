package com.cg.oops;

public class Car {

	String name;
	void print()
	{
		System.out.println("This is "+name);
	}
	public static void main(String[] args) {
		
		Car obj= new Car();
		obj.print();
	}

}
