package com.cg.regex;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="M1-16 @@ Shifa Afreen @@ Ankita @@ Netrangini";
		String[] res=str.split("@@");
		for ( String  in : res )
		{
			System.out.println(in);
		}

	}

}