package com.cg.scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		String str= sc.next();
		System.out.println(a);
		System.out.println(str);
		sc.close();
	}

}
