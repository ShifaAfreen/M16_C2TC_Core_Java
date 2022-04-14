package com.cg.inheritance;

class Keypadphone
{
	void call()
	{
		System.out.println("you can make calls");
	}
	void msg()
	{
		System.out.println("you can do messages");
	}
}
class Smartphone extends Keypadphone
{
	void camera()
	{ 
		System.out.println("you can take photos");
	}
	void internet()
	{
		System.out.println("you can  use social media, do surfing and many more");
	}
}
class Android extends Smartphone
{
	void touch()
	{
		System.out.println("you can do all of the above with single touch");
	}
}

public class MultilevelInheritance {
	
	
	
	public static void main(String[] args) {
		

		Android obj= new Android();
		System.out.println("In keypad phone");
		obj.call();
		obj.msg();
		System.out.println("In smart phone");
		obj.camera();
		obj.internet();
		System.out.println("In Android phone");
		obj.touch();
		
		
	}

}
