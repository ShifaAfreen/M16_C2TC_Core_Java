package com.cg.controlstructure;

public class Looping {

	public static void main(String[] args) {
		//right angle triangle pattern
		System.out.println("right angle triangle pattern using for loop");
		int n=4;
		for(int i=0;i<n;i++)//for no of rows
		{
			for(int j=0;j<=i;j++)//for no of columns
			{
				System.out.print("*  ");
				
			}System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		//Enhanced for loop 
		System.out.println("Displaing student name  using enhanced for loop");
		String ary[]= {"shifa","Afreen","sejal","trupti","priya","sonal"};
		System.out.println();
		
		for(String var:ary) {
			
			System.out.println(var);
			
		}
		
		System.out.println("------------------------------------------");
		//do..while loop
		//to print whole number
		System.out.println("prime number using do.. while loop");
		int no=0;
		int upto=5;
		do {
			System.out.print(no+"  ");
			no++;
		}while(no<=upto);
		
		
	} 
}


