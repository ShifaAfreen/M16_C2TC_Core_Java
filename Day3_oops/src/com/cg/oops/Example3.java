package com.cg.oops;
//parameterized constructor
public class Example3 {

	int res;
	Example3(int a, int b)
	{
		int res=a+b;
		this.res=res;
	}
	void display()
	{
		System.out.println("Addition of given two number is "+res);
	}
	public static void main(String[] args) {
		Example3 obj= new Example3(5,4);//passing parameter
		obj.display();
	}

}
