package com.cg.inheritance;
//hierchical inheritance
	class A
	{
		void show()
		{
		System.out.println("This is common super class");
		}
	}
	
	class B extends A
	{
		void show2()
		{
		System.out.println("class b extends super class A");
		}
	}
	
	class C extends A
	{
		void show3()
		{
		System.out.println("class c extends super class A");
		}
	}


public class hierchical {

	public static void main(String[] args) {

		C obj=new C();
		obj.show3();
		obj.show();
		B obj2=new B();
		obj2.show2();
		obj2.show();

	}

}
