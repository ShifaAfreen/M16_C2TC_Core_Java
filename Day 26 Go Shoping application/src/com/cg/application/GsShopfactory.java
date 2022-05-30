package com.cg.application;
import com.cg.framework.ShopFactory;

public class GsShopfactory extends ShopFactory {

	
	public GsPrimeAcc getNewPrimeAcc(int accNO, String accNm, float charges, boolean isPrime) {
		GsPrimeAcc obj = new GsPrimeAcc(accNO, accNm, charges, isPrime);
		return obj;
	}


	public GsNormalAcc getNewNormalAcc(int accNO, String accNm, float charges, float deliveryCharges) {
		GsNormalAcc obj1= new GsNormalAcc(accNO, accNm, charges, deliveryCharges);
		return obj1;
	}

}
