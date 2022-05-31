package com.cg.application;
import com.cg.framework.SavingAcc;
public class MMSavingAcc extends SavingAcc {

	final private static float MINBAL=100.0f;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal, isSalaried);
		
	}
	
	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}

	
	
}
