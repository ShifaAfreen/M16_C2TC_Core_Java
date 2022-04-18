package com.cg.this1;
class Account

{

int a;

int b;

public void setdata(int a,int b){

this.a = a;

this.b = b;

}

public void showdata(){

System.out.println("Value of A = "+a);

System.out.println("Value of B = "+b);

}

}

public class This_variable {

	public static void main(String[] args) {
		Account obj = new Account();

		obj.setdata(4,9);

		obj.showdata();
	}

}
