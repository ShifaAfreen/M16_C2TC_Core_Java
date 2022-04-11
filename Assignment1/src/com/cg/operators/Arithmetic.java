package com.cg.operators;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a= scr.nextInt();
		int b= scr.nextInt();
		
		System.out.println("which arithmetic operation do you want to perform");
		char c = scr.next().charAt(0);
		
		switch(c) {
		
		case '+':
			int res= a+b;
			System.out.println("Addition of these number is :"+res);
			break;
		case '-':
			int res1= a-b;
			System.out.println("subtraction of these number is :"+res1);
			break;
		case '*':
			int res2= a*b;
			System.out.println("multiplication of these number is :"+res2);
			break;
		case '/':
			int res3= a/b;
			System.out.println("division of these number is :"+res3);
			break;
		case '%':
			int res4= a%b;
			System.out.println("modulo division of these number is :"+res4);
			break;
			default:
				System.out.print("invalid input");
			
		}
		
		scr.close();
	}

}
