package com.cg.inheritance;
 
class Parent
	{
		void print()
		{
			System.out.println("this is parent class");
		}
	}

class Child extends Parent 
	{
		void show()
		{
			System.out.println("this is Child class");
		}
	}

public class SingleInheritance {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.print();
		obj.show();

	}

}
