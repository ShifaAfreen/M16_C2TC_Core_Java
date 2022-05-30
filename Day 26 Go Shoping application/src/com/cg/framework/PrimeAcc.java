package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	private static final float deliveryCharges=0.0f;
	public PrimeAcc(int accNO, String accNm, float charges,boolean isPrime) {
		super(accNO, accNm, charges);
		this.isPrime=isPrime;
		
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account no. is "+this.getAccNO()+" Account name is "+this.getAccNm()+
				"  Charges is "+charges);
	}
	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s,toString()=%s]", isPrime, super.toString());
		
	}
	
	
}
