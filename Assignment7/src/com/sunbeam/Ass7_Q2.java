package com.sunbeam;

class InvalidDiameterException extends Exception {
	@Override
	public String getMessage() {
		return "Diameter never be negative";
	}
}

class Circle {
	private double myX;
	private double myY;
	private double myDiameter;

	public Circle() {
		myX = 0.0;
		myY = 0.0;
		myDiameter = 100.0;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {

		this.myY = myY;
	}

	public double getMyDiameter() {

		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws InvalidDiameterException {
		if (myDiameter < 0.0) {
			throw new InvalidDiameterException();
		}
		this.myDiameter = myDiameter;
	}

	@Override
	public String toString() {
		return "Circle [myX=" + myX + ", myY=" + myY + ", myDiameter=" + myDiameter + "]";
	}

}

public class Ass7_Q2 {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setMyX(9.0);
		circle.setMyY(-7);
		try {
			circle.setMyDiameter(-8.0);
		} catch (InvalidDiameterException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(circle.toString());
	}

}
