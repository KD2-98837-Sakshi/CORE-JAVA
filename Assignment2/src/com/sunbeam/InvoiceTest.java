package com.sunbeam;

import java.util.Scanner;



public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in=new Invoice();
		in.setPartNo("20");
		in.setPartDiscription("Screw");	
		in.setPrice(-1);
		in.setQuantity(-4);
		double total_price=in.calculate_invoice();
		System.out.println(in.getPartNo());
		System.out.println(in.getPartDiscription());
		System.out.println(in.getPrice());
		System.out.println(in.getQuantity());
		System.out.println("total price: "+total_price);
		in.setPartNo("30");
		in.setPartDiscription("Bolt");	
		in.setPrice(1);
		in.setQuantity(4);
		total_price=in.calculate_invoice();
		System.out.println(in.getPartNo());
		System.out.println(in.getPartDiscription());
		System.out.println(in.getPrice());
		System.out.println(in.getQuantity());
		System.out.println("total price: "+total_price);

	}

}
