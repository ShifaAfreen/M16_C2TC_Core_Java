package com.cg.this_;

public class Example5 
{
	int  x ;
	Example5()
	{
		this(25);
		System.out.println("shifa");
	}
	Example5 ( int  x )
	{
		this.x=x;
		System.out.println("Afreen");
	}
	

	public static void main(String[] args) {
		Example5 e=new Example5(35);

	}

}