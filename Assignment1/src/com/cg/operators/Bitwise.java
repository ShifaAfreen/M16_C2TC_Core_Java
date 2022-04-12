package com.cg.operators;

public class Bitwise {

	public static void main(String[] args) {
		int a =40, b=2;
		int res=a & b;
		System.out.println("we have a= "+a+" b="+b);
		System.out.println("a & b:	"+res);
		res=a | b;
		System.out.println("a | b:	"+res);
		res=a ^ b;
		System.out.println("a ^ b:	"+res);
		res=a << b;
		System.out.println("a << b:	"+res);
		res=a >> b;
		System.out.println("a >> b:	"+res);
	}

}
