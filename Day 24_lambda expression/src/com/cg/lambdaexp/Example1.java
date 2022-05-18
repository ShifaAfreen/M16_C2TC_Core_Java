package com.cg.lambdaexp;

//lambda expression with no parameter
interface A
{
 void show();	
}

public class Example1 {

	public static void main(String[] args) {
		A obj = ()->
		{
			
			System.out.println("functional interface");
		};
		obj.show();

	}

}
