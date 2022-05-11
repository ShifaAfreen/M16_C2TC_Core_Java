package com.cg.generic;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		//no need for typecast while using generic
		LinkedList<String> obj= new LinkedList<String>();
		obj.add("shifa");
		obj.add("afreen");
		String res = obj.get(0);
		System.out.println(res);

	}

}
