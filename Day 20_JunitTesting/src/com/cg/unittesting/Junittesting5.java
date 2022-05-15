package com.cg.unittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Junittesting5 
{
	@Test
	void accept()
	{
		System.setProperty("1", "Shifa");
		Assumptions.assumeTrue("Shifa".equals(System.getProperty("1")));
	}
}