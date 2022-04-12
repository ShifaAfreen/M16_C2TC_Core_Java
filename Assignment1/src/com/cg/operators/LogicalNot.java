package com.cg.operators;

public class LogicalNot {
// to check if user is eligible to vote or not 
	public static void main(String[] args) {
		int a=4;
		if(!(a<18))//condition using not operator
		{
			System.out.println("you can vote");
		}
		else {
			System.out.println("you are not eligible");

		}

	}

}
