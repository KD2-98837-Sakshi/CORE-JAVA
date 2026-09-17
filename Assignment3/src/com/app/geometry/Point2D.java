package com.app.geometry;

import java.lang.Math;

public class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "x=>" + x + "\ty=>" + y;
	}

	public boolean isEquals(Point2D p2) {
		if (p2.x == this.x && p2.y == this.y)
			return true;
		else {
			return false;
		}
	}

	public double calculateDistance(Point2D p2) {
		double dis;
		if (this.isEquals(p2)) {
			dis = 0;
		} else {
			double sq1 = Math.pow((p2.x - this.x), 2);
			double sq2 = Math.pow((p2.y - this.y), 2);
			dis = Math.sqrt(sq1 + sq2);
		}

		return dis;
	}
}
