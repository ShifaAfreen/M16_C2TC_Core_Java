package com.cg.controlstructure;

import java.util.Scanner;

public class DmNestedifElse {

	public static void main(String[] args) {
		//to check if number is divisible by 2 , 3
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter a number");
	  int n= sc.nextInt();
	  
	    
	  if(n%2==0)
	  {
		  if(n%3==0)
		  {
			  System.out.println(n+" is divisible by 3 and 2 "); 
		  }
		  else
		  {
			  System.out.println(n+" is divisible by 2 ");
		  }
	  }
	  else if(n%3==0)
	  {
		  System.out.println(n+" is divisible by 3 ");
	  }
	  
	  sc.close();
	  
	}

}
