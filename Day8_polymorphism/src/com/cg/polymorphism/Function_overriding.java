package com.cg.polymorphism;
class Android
{

	void display()
	{
		System.out.println("Realme");
	}
}
class Apple extends Android
{

	void display()
	{
		System.out.println("iPhone 11 pro max");
	}
	
}
class Nokia extends Android
{

	void display()
	{
		System.out.println("iPhone ");
	}
	
}
public class Function_overriding {

	public static void main(String[] args) {
		Nokia a=new Nokia();
		Apple a1=new Apple();
		Android a2=new Android();
		a.display();
		a1.display();
		a2.display();
	}

}
