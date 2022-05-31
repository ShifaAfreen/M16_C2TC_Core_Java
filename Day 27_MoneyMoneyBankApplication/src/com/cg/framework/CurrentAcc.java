package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {

	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit= creditLimit;
		
	}
	public void withdraw(float accBal)
	
	/*if(accBal>(accBal+creditLimit))
	{
		System.out.println("Account no. is "+this.getAccNo()+" Account name is "+this.getAccNm()+
				"  Account balance  "+this.getAccBal()+" creditLimit "+creditLimit);
	}
	else 
	{
		System.out.println("Insufficient balance");
	}*/
	
	
	{
		if(accBal>creditLimit)
		{System.out.println("Account no. is "+this.getAccNo()+" Account name is "+this.getAccNm()+
					"  Account balance  "+this.getAccBal()+" creditLimit "+creditLimit);
		}
	else
	{
		System.out.println("insufficient balance");
	}
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s,toString=%s]", creditLimit,super.toString());
	}
	
	

	
}
