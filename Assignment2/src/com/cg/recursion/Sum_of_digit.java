package com.cg.recursion;
//program to print sum of digit in a number using recursion
import java.util.Scanner;

public class Sum_of_digit {
	
	static int sum(int a)
	{
		int rem= a%10;
		if(a==0)
		{
			return 0;
		}
		return rem+sum(a/10);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		System.out.print("Sum of the digits in the number is: "+sum(n));
		sc.close();

	}

}
