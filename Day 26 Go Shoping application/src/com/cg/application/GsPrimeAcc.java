package com.cg.application;
import com.cg.framework.PrimeAcc;

public class GsPrimeAcc extends PrimeAcc{

	public GsPrimeAcc(int accNO, String accNm, float charges, boolean isPrime)
	{
		super(accNO, accNm, charges, isPrime);
		
	}

	@Override
	public String toString() {
		return String.format("GsPrimeAcc [toString()=%s]", super.toString());
	}
	

}
