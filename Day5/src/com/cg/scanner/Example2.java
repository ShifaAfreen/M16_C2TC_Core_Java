package com.cg.scanner;

import java.io.*;

public class Example2 {

	public static void main(String[] args) throws  IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		System.out.println(str);
		br.close();
	}

}
