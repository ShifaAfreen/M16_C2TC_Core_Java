package com.cg.controlstructure;

import java.util.Scanner;

public class DmSwitch {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1-7");
		a= sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("Wednessday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("invalid number");	
		}
		
		sc.close();
	}

}
