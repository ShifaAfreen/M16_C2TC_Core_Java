package com.cg.operators;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		
		//program to check number divisible by 2 and 3
		System.out.println("enter a number");
		Scanner s= new Scanner(System.in);
		int a =s.nextInt();
		if(a%2==0 && a%3==0)
		{
			System.out.println("number is divisible by 2 and 3");
		}
		else {
			System.out.println("not divisible by both 2 and 3");
		}
		s.close();
		
	}

}
