package com.cg.multithread2;

class Parent{
	void print(int num)
	{
		synchronized(this)
		{
			for(int i=1;i<=num;i++)
			{
				System.out.println(num*i);
			}
			try {
				Thread.sleep(400);
			}
			catch(InterruptedException e){
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}
}

class Child extends Thread
{
	Parent p;
	Child(Parent p)
	{
		this.p=p;
	}
	public void run()
	{
		p.print(20);
	}
	
}

class Child1 extends Thread
{
	Parent p1;
	Child1(Parent p1)
	{
		this.p1=p1;
	}
	public void run()
	{
		p1.print(10);
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		
		

	}

}
