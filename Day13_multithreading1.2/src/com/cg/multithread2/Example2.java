package com.cg.multithread2;

class Parent1 extends Thread{
	
	public void run()
	{
		try {
			Thread.sleep(10000);
			System.out.println("c2tc");
		}
		catch(InterruptedException e){
			System.out.println("exception occured");
			
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.start();
		try {
			p.interrupt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
