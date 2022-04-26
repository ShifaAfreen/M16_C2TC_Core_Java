package com.cg.array;

class Employee
{

	public int id;
	public String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class Example4 {

	public static void main(String[] args) {
		Employee arr[];
		arr=new Employee[3];
		arr[0]=new Employee(101,"shifa");
		arr[1]=new Employee(102,"Afreen");
		arr[2]=new Employee(103,"Haroon");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at "+i+":"+ arr[i].id+" "+arr[i].name);
		}
	}

}
