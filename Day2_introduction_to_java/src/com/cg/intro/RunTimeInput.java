package com.cg.intro;

import java.util.Scanner;

public class RunTimeInput {

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		//premitive datatype
		System.out.println("Enter boolean value");
		boolean b = scr.nextBoolean();
		System.out.println("Enter char value");
		 char c= scr.next().charAt(0);
		System.out.println("Enter byte value");
		byte by = scr.nextByte();
		System.out.println("Enter short value");
		short sh = scr.nextShort();
		System.out.println("Enter int value");
		int a = scr.nextInt();
		System.out.println("Enter long value");
		long l = scr.nextLong();
		System.out.println("Enter float value");
		float f = scr.nextFloat();
		System.out.println("Enter double value");
		double dbl = scr.nextDouble();
		// non premitive datatype
		System.out.println("Enter string value");
		String str = scr.next();
		//printing output
		System.out.println("------------------------------");
		System.out.println("Data of run time input is");
		System.out.println("value for boolean is "+b);
		System.out.println("value for char is "+c);
		System.out.println("value for byte is "+by);
		System.out.println("value for short is "+sh);
		System.out.println("value for int is "+a);
		System.out.println("value for long is "+l);
		System.out.println("value for float is "+f);
		System.out.println("value for double is "+dbl);
		System.out.println("value for string is "+str);
		scr.close();
		

	}

}
