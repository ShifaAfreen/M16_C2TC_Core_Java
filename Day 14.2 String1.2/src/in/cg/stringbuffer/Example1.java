package in.cg.stringbuffer;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		String str="shifa";
		StringBuffer s = new StringBuffer(str.length());
		System.out.println(s.capacity());//capacity 
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String st= sc.next();
		StringBuffer sb= new StringBuffer(st);
		System.out.println(sb.capacity());
		sc.close();
		
		
	}

}
