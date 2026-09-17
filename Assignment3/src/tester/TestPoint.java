package tester;

import com.app.geometry.*;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2;
		System.out.print("Enter x1: ");
		x1 = sc.nextInt();
		System.out.print("Enter y1: ");
		y1 = sc.nextInt();
		System.out.print("Enter x2: ");
		x2 = sc.nextInt();
		System.out.print("Enter y2: ");
		y2 = sc.nextInt();
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		p1.calculateDistance(p2);
		System.out.println("Details of point 1: " + p1.getDetails());
		System.out.println("Details of point 2: " + p2.getDetails());
		System.out.println("Distance Between points is: " + p1.calculateDistance(p2));
	}

}
