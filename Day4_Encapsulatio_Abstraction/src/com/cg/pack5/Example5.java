package com.cg.pack5;

public class Example5 {
	
	private int sum=12;
	private int add(int a , int b)
	{
		return(a+b);
	}

	public static void main(String[] args) {
		Example5 obj=new Example5();
		System.out.println(obj.sum);
		System.out.println(obj.add(12,15));

	}

}
