package com.cg.abstract1;

final class Parentk extends Childk
{
	 void accept()
	{
		System.out.print("Parent");
	}
}

class Childk 
{
	void print()
	{
		System.out.print("Child");
	}
	
}

public class Example4 {

	public static void main(String[] args) {
		Parentk c = new Parentk();
		c.accept();
		c.print();

	}

}
