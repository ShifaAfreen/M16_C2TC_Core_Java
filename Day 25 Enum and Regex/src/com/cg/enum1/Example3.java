package com.cg.enum1;
enum  bike
{
	Pulser,KTM,R3,R15,Honda
}
public class Example3 {

	public static void main(String[] args) {
		bike b=bike.Honda;
		switch(b)
		{
		case Pulser:
			System.out.println("You choose Pulser");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R3:
			System.out.println("You choose R3");
			break;
			
		case R15 :
			System.out.println("You choose R15");
			break;
			
		case Honda:
			System.out.println("You choose honda");
			break;
			
		default:
			System.out.println("Invalid name");
		}

	}

}