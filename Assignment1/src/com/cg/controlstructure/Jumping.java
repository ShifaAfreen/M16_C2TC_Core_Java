package com.cg.controlstructure;

public class Jumping {
	static int a=5;
	static int returncheck()
	{
		return(a);
	}

	public static void main(String[] args) {
		
		while(a>0)
		{
			if(a==0)
			{break;}
			
			System.out.println(returncheck());
			a--;
			continue;
		}

	}

}
