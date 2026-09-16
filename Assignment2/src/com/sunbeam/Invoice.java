package com.sunbeam;

import java.util.Scanner;

public class Invoice {
	private String partNo;
	private String partDiscription;
	private int quantity;
	double price;
	public Invoice() {}
	public Invoice(String partNo, String partDiscription, int quantity, double price) {
		this.partNo=partNo;
		this.partDiscription=partDiscription;
		this.quantity=quantity;
		this.price=price;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDiscription() {
		return partDiscription;
	}

	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity<0) {
			this.quantity=0;
		}
		else {
			this.quantity = quantity;
		}
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0.0) {
			this.price=0.0;
		}
		else {
			this.price = price;
		}
	}
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter part number: ");
		partNo=sc.nextLine();
		System.out.print("Enter part discription: ");
		partDiscription=sc.nextLine();
		System.out.print("Enter Quantity: ");
		quantity=sc.nextInt();
		System.out.print("Enter Price: ");
		price=sc.nextDouble();
	}
	public void displayRecord() {
		System.out.println("Part Number: "+partNo);
		System.out.println("Part Discription: "+partDiscription);
		System.out.println("Quantity: "+quantity);
		System.out.println("Price: "+price);
	}
	public double calculate_invoice() {
		return quantity*price;
	}
	
}