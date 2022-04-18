package com.cg.polymorphism;

class Shape
{

	void print(int a ,int b)
	{
		System.out.println(a*b);
	}
	void print(float a ,float b)
	{
		System.out.println(a*b);
	}
	void print(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
}

public class Function_overloading {

	public static void main(String[] args) {
	
		Shape s=new Shape();
		s.print(10.0f, 1.2f);
		s.print(2, 3);
		s.print(2, 3, 2);
	}

}
