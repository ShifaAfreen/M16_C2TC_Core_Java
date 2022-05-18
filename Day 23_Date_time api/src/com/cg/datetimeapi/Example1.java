package com.cg.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		//LocalDate obj = LocalDate.now();
		//LocalTime obj1 = LocalTime.now();
		LocalDateTime obj = LocalDateTime.now();
		LocalDate obj2=LocalDate.of(2022, 2, 28);
		System.out.println(obj);
		System.out.println(obj2);
		//System.out.println(obj1);
	}

}
