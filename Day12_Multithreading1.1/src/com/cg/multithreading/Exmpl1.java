package com.cg.multithreading;

public class Exmpl1 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread "+t);
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}

}
