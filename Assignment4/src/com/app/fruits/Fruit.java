package com.app.fruits;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	boolean isFresh;

	public Fruit() {
	}

	public Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return String.format("color: %s\n weight:  %f \n name %s\n is Fresh: %s", color, weight, name, isFresh);
	}

	abstract public String taste();

}

class Mango extends Fruit {

	public Mango(String color, int i, String string2) {
		super(color, i, string2);
	}

	@Override
	public String taste() {
		return "sweet";
	}

}

class Orange extends Fruit {
	public Orange(String string, int i, String string2) {
		super(string, i, string2);
	}

	@Override
	public String taste() {
		return "sour";
	}

}

class Apple extends Fruit {
	public Apple(String string, int i, String string2) {
		super(string, i, string2);
	}

	@Override
	public String taste() {
		return "sweet and sour";
	}

}
