package com.cg.recursion;
//program to print fibonacci series using recursion
import java.util.Scanner;

public class Fibonaci_series {
	static int fibo(int n){
	    if(n==1){
	      return 0;
	    }
	    else if(n == 2){
	      return 1;
	    } else {
	      return fibo(n-2)+fibo(n-1);
	    }
	 
	  }
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
	    int n = sc.nextInt();
	    System.out.println("First "+n+" numbers of fibonacci series is");
	    for(int i=1; i<=n; i++){
	      //call recursive function for n time
	      System.out.print(fibo(i)+" ");
	      sc.close();
	}

}
}
