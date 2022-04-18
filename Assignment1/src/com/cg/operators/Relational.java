package com.cg.operators;

public class Relational {

	public static void main(String[] args) {
		int a=10;
		int b= 3;
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("a is less than b");
		String res= a<b?"true":"false";//less than relational operator
		System.out.println(res);
		System.out.println("a is greater than b");
		 res= a>b?"true":"false";//greater than relational operator
		System.out.println(res);
		System.out.println("a is equlas to b");
		 res= a==b?"true":"false";//equals to relational operator
		System.out.println(res);
		System.out.println("a is not equals to b");
		 res= a!=b?"true":"false";//not equals to  relational operator
		System.out.println(res);
		System.out.println("a is less than equals to b");
		res= a<=b?"true":"false";//less than equals to relational operator
		System.out.println(res);
		System.out.println("a is greater than equls to  b");
		 res= a>=b?"true":"false";//greater than equals to relational operator
		System.out.println(res);
		
	}

}
