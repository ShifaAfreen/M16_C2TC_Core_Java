package com.cg.polymorphism;

class Renault
{

	String color;
	int speed;
	Renault()
	{
		System.out.println("Renault-RXE");
	}
	Renault(String clr,int s)
	{
		color=clr;
		speed=s;
		System.out.println("color is "+clr+" "+"speed is "+s+"km/hr");
	}
}

public class Constructor_overloading {

	public static void main(String[] args) {
		Renault r=new Renault();
		Renault r1=new Renault("black",120);
	}

}
