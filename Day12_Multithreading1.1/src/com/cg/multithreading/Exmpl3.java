package com.cg.multithreading;

public class Exmpl3 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread "+t);
		t.setName("shifa");
		t.setPriority(9);
		System.out.println("Current thread "+t);
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}

}
