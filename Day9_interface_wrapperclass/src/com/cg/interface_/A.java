package com.cg.interface_;

public interface A 
{
	public void print();

}
class B implements A
{
	public void print()
	{
		System.out.println("Hey Guys,Welcome to the concept of interfaces");
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.print();
	}
}