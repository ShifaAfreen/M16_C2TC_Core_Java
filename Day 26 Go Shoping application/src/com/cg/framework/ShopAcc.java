package com.cg.framework;

public abstract class ShopAcc {

	private int accNO;
	private String accNm;
	private float charges;
	public ShopAcc(int accNO, String accNm, float charges) {
		
		this.accNO = accNO;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	abstract public void bookProduct(float charges);
	public void item(float charges)
	{
		System.out.println(charges);
	}

	
	public int getAccNO() {
		return accNO;
	}

	/*public void setAccNO(int accNO) {
		this.accNO = accNO;
	}*/

	public String getAccNm() {
		return accNm;
	}

	/*public void setAccNm(String accNm) {
		this.accNm = accNm;
	}*/

	public float getCharges() {
		return charges;
	}

	/*public void setCharges(float charges) {
		this.charges = charges;
	}*/
	
	public float getCharge()
	{
		return charges;
	}

	@Override
	public String toString() {
		return String.format("ShopAcc [accNO=%s, accNm=%s, charges=%s]", accNO, accNm, charges);
	}
	
	
	
}