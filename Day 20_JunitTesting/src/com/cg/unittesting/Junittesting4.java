package com.cg.unittesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Junittesting4 {
 @BeforeAll
	static void display()
 {
	 System.out.println("sushmita");
 }
 @Tag("Diya")
 @Disabled
 @Test
 void display1()
 {
	 System.out.println("kamal");
 }
}
