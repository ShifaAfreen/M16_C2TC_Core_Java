package com.cg.collection;
import java.util.Vector;
public class Example5 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("saujan");
		v.add(11);
		v.add(1,"technical");//adding at 1 position
		System.out.println(v);
		Vector v2= new Vector();
		v2.add(3);
		v2.add(4);
		v2.add("java");
		v2.add("method");
		Vector v3 = new Vector();
		v3.addAll(v2);
		System.out.println(v2+"This is second vector");
		System.out.println(v2+"this is third vector");
		if(v3.equals(v2))
		{
			System.out.println("both 2nd and 3rd vectors are equal");
		}
		else
		{
			System.out.println("both 2nd and 3rd  vectors are unequal");
		}
		v3.setElementAt(2, 0);
		System.out.println(v3);
		

	}

}
