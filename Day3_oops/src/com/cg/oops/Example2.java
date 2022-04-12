package com.cg.oops;

public class Example2 {
	
	String str;
	Example2(String str)
	{
		this.str=str;
		System.out.println("This is "+str);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Example2 obj= new Example2("BMW");
		
	
	}

}
