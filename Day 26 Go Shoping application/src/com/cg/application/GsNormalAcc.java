package com.cg.application;
import com.cg.framework.NormalAcc;
public class GsNormalAcc extends NormalAcc 
{

	public GsNormalAcc(int accNO, String accNm, float charges, float deliveryCharges) 
	{
		super(accNO, accNm, charges, deliveryCharges);
		
	}

	@Override
	public String toString() {
		return String.format("GsNormalAcc [toString()=%s]", super.toString());
	}
	

}
