package com.cg.lambdaexp;

interface D
{
	int mul(int a ,int b);
}

public class Example5 {

	public static void main(String[] args) {
		D obj=(int a, int b)->(a*b);
		System.out.println("Multiplicaion of a and b is "+obj.mul(10, 20));
		

	}

}
