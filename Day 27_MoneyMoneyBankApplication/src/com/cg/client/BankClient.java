package com.cg.client;
import com.cg.application.*;
import com.cg.framework.*;

public class BankClient {

	public static void main(String args[])
	{
		BankFactory b= new MMBankFactory();
		SavingAcc obj1 = new MMSavingAcc(123,"shifa afreen",2000, true);
		CurrentAcc obj2 = new MMCurrentAcc(456, "sheikh", 1500,200); 
		
		System.out.println("Saving account");
		obj1.withdraw(obj1.getAccBal());
		
		System.out.println("Current account");
		obj2.withdraw(obj2.getAccBal());
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
