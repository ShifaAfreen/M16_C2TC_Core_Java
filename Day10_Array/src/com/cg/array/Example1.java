package com.cg.array;

public class Example1 {

	public static void main(String[] args) {
		int[] arr= {10,11,12,13,4};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//enhanced for loop
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
