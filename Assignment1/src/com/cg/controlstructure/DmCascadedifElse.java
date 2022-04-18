package com.cg.controlstructure;

import java.util.Scanner;

public class DmCascadedifElse {

	public static void main(String[] args) {

		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else if(a==b)
		{
			System.out.println("both numbers are equal");
		}
		else
		{
			System.out.println(b+" is greater");
		}
		
		sc.close();
	}

}
