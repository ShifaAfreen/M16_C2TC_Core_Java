package com.cg.framework;

public abstract class SavingAcc extends BankAcc
{

	private boolean isSalaried;
	final private static float MINBAL=0.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
		
	}
	public void withdraw(float accBal)
	{
		if(accBal>MINBAL)
		{
		System.out.println("Account no "+this.getAccNo()+" Acccount name "+this.getAccNm()+
				" Account balance "+this.getAccBal());
		}
		else
		{
			System.out.println("insufficent balance");
		}
	}
	
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s,toString=%s]", isSalaried,super.toString());
	}
	
}
