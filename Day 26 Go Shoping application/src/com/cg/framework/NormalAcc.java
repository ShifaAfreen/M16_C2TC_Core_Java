package com.cg.framework;

public abstract class NormalAcc extends ShopAcc
{
	private  final float deliveryCharges; 
	public NormalAcc(int accNO, String accNm, float charges, float deliveryCharges) {
		super(accNO, accNm, charges);
		this.deliveryCharges= deliveryCharges;
		// TODO Auto-generated constructor stub
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account no. is "+this.getAccNO()+" Account name is "+this.getAccNm()+
				"  Charges is "+(charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s,toString()=%s]", deliveryCharges,super.toString());
	}
	

	
}

