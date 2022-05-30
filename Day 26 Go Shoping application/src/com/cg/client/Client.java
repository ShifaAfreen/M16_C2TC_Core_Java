package com.cg.client;
import com.cg.application.*;
import com.cg.framework.*;


public class Client {

	public static void main(String[] args) {
		ShopFactory sf= new GsShopfactory();
		PrimeAcc pa= new GsPrimeAcc(101,"shifa", 500, true);
		NormalAcc na= new GsNormalAcc(102,"shifa afreen",500,50);
		
		System.out.println("Prime account");
		pa.bookProduct(pa.getCharge());
		
		System.out.println("Normal account");
		na.bookProduct(na.getCharges());
		
		/*System.out.println(sf.getNewPrimeAcc(103, "Hritik", 1000, true));
		System.out.println(sf.getNewNormalAcc(104, "Anoop", 1000, 50));*/
		
		System.out.println(pa);
		System.out.println(na);

	}

}
