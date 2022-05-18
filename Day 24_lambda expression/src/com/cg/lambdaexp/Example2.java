package com.cg.lambdaexp;
interface P
{
	String display(String str);
	
}

public class Example2 {

	public static void main(String[] args) {
		P obj=(String s)->
		{
			return s;
		};
		System.out.println(obj.display("lambda expression with single parameter"));
	}

}
