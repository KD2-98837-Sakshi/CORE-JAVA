package com.sunbeam;

public class DateTest {

	public static void main(String[] args) {
		Date d1=new Date(25, 07, 2004);
		d1.displayDate();
		d1.setDay(01);
		d1.setMonth(03);
		d1.setYear(2026);
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());
		d1.displayDate();
	}

}
