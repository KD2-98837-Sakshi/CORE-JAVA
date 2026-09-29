package com.sunbeam;

enum TrafficLight {
	Red(30),
	Green(40),
	Yellow(50);

	private final int duration;

	private TrafficLight(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
}

public class Traffic {

	public static void main(String[] args) {
		System.out.println("=============Traffic Light Duration=============");

		for (TrafficLight light : TrafficLight.values()) {
			System.out.println(light + " : " + light.getDuration());
		}
	}
}