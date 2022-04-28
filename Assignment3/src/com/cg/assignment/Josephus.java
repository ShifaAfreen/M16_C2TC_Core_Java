package com.cg.assignment;

import java.util.Scanner;

public class Josephus {

	static int remain(int n,int k)
	{
		if (n==1)
		{return 0;}
		int x=remain(n-1,k);
		int y=(x+k)%n;
		return y;
		
	}
	public static void main(String[] args) {
		 
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n= scr.nextInt();
		System.out.println("Enter value of k:");
		int k= scr.nextInt();
		System.out.println(remain(n,k));
		scr.close();
		

	}

}
